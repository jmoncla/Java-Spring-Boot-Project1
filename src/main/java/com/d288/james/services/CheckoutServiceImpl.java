package com.d288.james.services;


import com.d288.james.dao.CartRepository;
import com.d288.james.dao.CustomerRepository;
import com.d288.james.entities.Cart;
import com.d288.james.entities.CartItem;
import com.d288.james.entities.Customer;
import com.d288.james.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.d288.james.services.PurchaseResponse;
import com.d288.james.services.Purchase;


import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {


    private CartRepository cartRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CartRepository cartRepository, CustomerRepository customerRepository){
        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Cart cart = purchase.getCart();
        Customer customer = purchase.getCustomer();
        Set<CartItem> cartItems = purchase.getCartItems();




        String orderTrackingNumber = generateOrderTrackingNumber();

        cartItems.forEach(item -> {
            item.setCart(cart);
            cart.add(item);
                });

        cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setStatus(StatusType.ordered);
        customer.add(cart);


        if (cart == null || cart.getCartItems() == null || cart.getCartItems().isEmpty()) {

            throw new IllegalArgumentException("Cannot place an order with an empty cart");
        }

        cartRepository.save(cart);

        /*customerRepository.save(customer);


         */



        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber(){

        return UUID.randomUUID().toString();

    }


}

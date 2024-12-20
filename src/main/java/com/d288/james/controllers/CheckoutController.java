package com.d288.james.controllers;


import com.d288.james.services.CheckoutService;
import com.d288.james.services.CheckoutServiceImpl;
import com.d288.james.services.Purchase;
import com.d288.james.services.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;


    @Autowired
    public CheckoutController (CheckoutService checkoutService){
        this.checkoutService =checkoutService;

    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}

package com.d288.james.services;

import com.d288.james.entities.Cart;
import com.d288.james.entities.CartItem;
import com.d288.james.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;


}

package com.d288.james.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PurchaseResponse {

    @NonNull
    private String orderTrackingNumber;

}

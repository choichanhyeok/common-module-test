package com.supermarket.common.payment.response;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResponse {
    private final String paymentStatus;
    private final String responseMessage;
}

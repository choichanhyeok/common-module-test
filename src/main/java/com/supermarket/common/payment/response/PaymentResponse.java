package com.supermarket.common.payment.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResponse {
    @JsonProperty("paymentStatus")
    private final String paymentStatus;
    @JsonProperty("responseMessage")
    private final String responseMessage;
}

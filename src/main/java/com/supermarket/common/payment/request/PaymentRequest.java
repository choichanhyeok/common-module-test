package com.supermarket.common.payment.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentRequest {
    @JsonProperty("orderId")
    private final Long orderId;
    @JsonProperty("customerId")
    private final String customerId;
    @JsonProperty("paymentAmount")
    private final double paymentAmount;
}

package common.payment.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class PaymentRequest {
    private final Long orderId;
    private final String customerId;
    private final double paymentAmount;

    @JsonCreator
    public PaymentRequest(@JsonProperty("orderId") Long orderId,
                          @JsonProperty("customerId") String customerId,
                          @JsonProperty("paymentAmount") double paymentAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.paymentAmount = paymentAmount;
    }
}
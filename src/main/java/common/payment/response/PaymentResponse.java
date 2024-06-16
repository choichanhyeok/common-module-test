package common.payment.response;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class PaymentResponse {
    private final String paymentStatus;
    private final String responseMessage;

    @JsonCreator
    public PaymentResponse(@JsonProperty("paymentStatus") String paymentStatus,
                           @JsonProperty("responseMessage") String responseMessage) {
        this.paymentStatus = paymentStatus;
        this.responseMessage = responseMessage;
    }
}
package common.payment.response;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResponse {
    private String paymentStatus;
    private String responseMessage;
}

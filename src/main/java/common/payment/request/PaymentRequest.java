package common.payment.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentRequest {
    private Long orderId;
    private String customerId;
    private double paymentAmount;
}

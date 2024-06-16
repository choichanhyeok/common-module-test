package common.payment.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentRequest {
    private final Long orderId;
    private final String customerId;
    private final double paymentAmount;
}

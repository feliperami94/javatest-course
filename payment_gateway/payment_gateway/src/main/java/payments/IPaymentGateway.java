package payments;

public interface IPaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}

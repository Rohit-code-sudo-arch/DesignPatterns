package behavior.strategy.payment;

public class Payment {
    static void main(String[] args) {

        PaymentService paymentService = new PaymentService(new CreditCardPaymentStrategy());
        paymentService.makePayment(1000);
    }
}

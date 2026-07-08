package creational.factory;

public class PaymentService {

    public void makePayment(String paymentType, double amount) throws Exception {
        Payment payment = PaymentFactory.getPayment(paymentType);
        payment.pay(amount);
    }

    static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        try {
            paymentService.makePayment("UPII", 1200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

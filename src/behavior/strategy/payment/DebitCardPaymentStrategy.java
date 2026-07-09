package behavior.strategy.payment;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "using Debit Card");
    }
}

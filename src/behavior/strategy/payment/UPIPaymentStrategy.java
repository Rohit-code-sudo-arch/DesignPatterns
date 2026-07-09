package behavior.strategy.payment;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        //TODO add your payment logic here
        System.out.println("Paying " + amount + "using UPI");
    }
}

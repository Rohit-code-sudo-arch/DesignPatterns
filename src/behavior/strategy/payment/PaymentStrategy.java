package behavior.strategy.payment;

@FunctionalInterface
public interface PaymentStrategy {
    public void pay(double amount);
}

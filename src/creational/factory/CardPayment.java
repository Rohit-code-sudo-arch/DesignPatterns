package creational.factory;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using card");
    }
}

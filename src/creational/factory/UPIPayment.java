package creational.factory;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using UPI");
    }
}

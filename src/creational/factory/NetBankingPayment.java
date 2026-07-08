package creational.factory;

public class NetBankingPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using NetBanking");
    }
}

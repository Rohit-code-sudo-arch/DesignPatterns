package creational.factory;

public class PaymentFactory {

    public static Payment getPayment(String type) {
        switch (type) {
            case "Card":
                return new CardPayment();
            case "UPI":
                return new UPIPayment();
            case "NetBanking":
                return new NetBankingPayment();
            default:
                return null;
        }
    }
}

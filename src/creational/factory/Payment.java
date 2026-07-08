package creational.factory;

@FunctionalInterface
public interface Payment {
    void pay(double amount) throws Exception;
}

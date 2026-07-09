package behavior.observer;

public class Order {

    static void main(String[] args) {
        OrderPublisher orderPublisher = new OrderPublisher();
        orderPublisher.addObserver(new EmailObserver());
        orderPublisher.addObserver(new SmsObserver());
        orderPublisher.addObserver(new InventoryObserver());
        OrderService orderService = new OrderService(orderPublisher);
        orderService.update("ORD123");
    }
}

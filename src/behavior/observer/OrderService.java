package behavior.observer;

public class OrderService {

    private OrderPublisher orderPublisher;

    public OrderService(OrderPublisher orderPublisher) {
        this.orderPublisher = orderPublisher;
    }

    public void update(String order) {
        orderPublisher.notifyObservers(order);
    }
}

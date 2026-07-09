package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderPublisher {

    List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}

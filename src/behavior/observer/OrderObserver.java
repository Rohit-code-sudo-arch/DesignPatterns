package behavior.observer;

@FunctionalInterface
public interface OrderObserver {
    void update(String order);
}

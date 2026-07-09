package behavior.strategy.notification;

@FunctionalInterface
public interface NotificationStrategy {

    public void sendNotification(String message);
}


package behavior.strategy.notification;

public class EmailNotification implements NotificationStrategy {

    public void sendNotification(String message) {
        System.out.println("Sending email to " + message);
    }
}

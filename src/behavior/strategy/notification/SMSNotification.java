package behavior.strategy.notification;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending sms to " + message);
    }
}

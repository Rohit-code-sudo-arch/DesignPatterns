package behavior.strategy.notification;

public class WhatsappNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending whatsapp to " + message);
    }
}

package behavior.strategy.notification;

public class Notification {
    static void main(String[] args) {
        NotificationService service = new NotificationService(new WhatsappNotification());
        service.sendNotification("Hello World");
    }
}

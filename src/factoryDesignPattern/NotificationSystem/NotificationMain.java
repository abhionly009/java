package factoryDesignPattern.NotificationSystem;

public class NotificationMain {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser("9005805189","483293","whatsApp");
    }
}

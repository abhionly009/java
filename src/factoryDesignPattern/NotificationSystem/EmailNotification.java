package factoryDesignPattern.NotificationSystem;

public class EmailNotification implements Notifier{
    @Override
    public void send(String message, String userId) {
        System.out.println("Email has been sent to " + userId + " with OTP "+   message);
    }
}

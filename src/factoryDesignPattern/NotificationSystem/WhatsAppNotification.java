package factoryDesignPattern.NotificationSystem;

public class WhatsAppNotification implements Notifier{
    @Override
    public void send(String message, String userId) {
        System.out.println("Message has been to sent to  " + userId + " with OTP  " +message);
    }
}

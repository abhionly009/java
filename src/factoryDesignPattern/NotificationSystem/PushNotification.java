package factoryDesignPattern.NotificationSystem;

public class PushNotification implements Notifier{
    @Override
    public void send(String message, String userId) {
        System.out.println("Push notification has been done to " + userId +" with OTP "+  message);
    }
}

package factoryDesignPattern.NotificationSystem;

public class SMSNotification implements Notifier{
    @Override
    public void send(String message, String userId) {
        System.out.println("SMS Sent to "  + userId + " with  OTP " +  message  );
    }
}

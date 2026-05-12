package factoryDesignPattern.NotificationSystem;

public class NotificationService {

    public void notifyUser(String userId, String message, String type){
        NotificationFactory factory = new NotificationFactory();

      Notifier notifier =   factory.getNotificationMechanism(type);

        notifier.send(message,userId);

    }
}

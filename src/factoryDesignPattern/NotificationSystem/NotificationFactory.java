package factoryDesignPattern.NotificationSystem;

public class NotificationFactory {

    public Notifier getNotificationMechanism(String mechanism){

        switch (mechanism.toLowerCase()){
            case "email": return new EmailNotification();
            case "push": return new PushNotification();
            case "sms" : return new SMSNotification();
            case "whatsapp" : return new WhatsAppNotification();
            default: throw new IllegalArgumentException("Unknown notification channel ");
         }

    }
}

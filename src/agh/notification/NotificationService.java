package agh.notification;

public class NotificationService {

    private final NotificationFactory notificationFactory;

    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }


    public void sendNotification(String type, String message){
       Notification notification = notificationFactory.getNotification(type);
       if (notification !=null){
           notification.send(message);

       }

    }

}

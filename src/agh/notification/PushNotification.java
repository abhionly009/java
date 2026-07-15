package agh.notification;

public class PushNotification implements Notification{


    @Override
    public void send(String message) {
        System.out.println("Sending notification via Push..... "+  message);
    }
}

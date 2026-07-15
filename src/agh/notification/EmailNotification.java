package agh.notification;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending Message vai email.... " +message);
    }
}

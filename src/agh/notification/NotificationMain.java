package agh.notification;

public class NotificationMain {

    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        NotificationService notificationService = new NotificationService(notificationFactory);

        notificationService.sendNotification("Email", "Hello Abhi!");
        notificationService.sendNotification("SMS", "Hello Abhi!");

    }
}

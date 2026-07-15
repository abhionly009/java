package agh.notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {

    private final Map<String,Notification> notificationMap = new HashMap<>();

    public NotificationFactory ()
    {
     notificationMap.put("EMAIL", new EmailNotification());
     notificationMap.put("SMS", new SmsNotification());
     notificationMap.put("PUSH", new PushNotification());
    }

    public Notification getNotification(String type){

        return notificationMap.get(type.toUpperCase());
    }


}

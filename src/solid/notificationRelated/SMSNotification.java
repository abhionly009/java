package solid.notificationRelated;

import solid.model.User;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser(User user) {
        System.out.println("Notifying user for the order on ..." + user.getMobile());
    }
}

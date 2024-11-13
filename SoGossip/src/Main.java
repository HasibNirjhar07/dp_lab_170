import Interface.NotificationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SocialMediaFacade aggregator = new SocialMediaFacade();


        List<NotificationService> notifications = aggregator.getAllNotifications();


        notifications.forEach(notification ->
                System.out.println(notification.getPlatform() + ": " + notification.getMessage()));


        if (!notifications.isEmpty()) {
            String firstNotificationId = notifications.get(0).getId();
            aggregator.markAsRead(firstNotificationId);
            aggregator.markAsUnread(firstNotificationId);
            aggregator.delete(firstNotificationId);


        }
    }
}

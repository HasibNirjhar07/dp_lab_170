import API.FacebookAPI;
import API.TwitterAPI;
import Interface.NotificationService;
import Notification.FacebookNotification;
import Notification.TwitterNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialMediaFacade {

    private FacebookAPI facebookAPI;
    private TwitterAPI twitterAPI;

    private Map<String, NotificationService> notifications;

    public SocialMediaFacade() {
        this.facebookAPI = new FacebookAPI();
        this.twitterAPI = new TwitterAPI();
        this.notifications=new HashMap<>();
    }

    public List<NotificationService> getAllNotifications() {
        List<NotificationService> allNotifications = new ArrayList<>();


        List<TwitterNotification> twitterNotifications = twitterAPI.getNotifications();

//        System.out.println("Twitter Notifications:"+ twitterNotifications);
        allNotifications.addAll(twitterNotifications);


        List<FacebookNotification> facebookNotifications = facebookAPI.getNotifications();
//        System.out.println("Facebook Notifications:"+ facebookNotifications);
        allNotifications.addAll(facebookNotifications);


        allNotifications.forEach(notification ->
                notifications.put(notification.getId(), notification));

        return allNotifications;
    }


    public void markAsRead(String id) {
        NotificationService notification = notifications.get(id);
        if (notification != null) {
            notification.markAsRead();
        } else {
            System.out.println("Notification not found");
        }
    }


    public void markAsUnread(String id) {
        NotificationService notification = notifications.get(id);
        if (notification != null) {
            notification.markAsUnread();
        } else {
            System.out.println("Notification not found");
        }
    }


    public void delete(String id) {
        NotificationService notification = notifications.get(id);
        if (notification != null) {
            notification.delete();
            notifications.remove(id);
        } else {
            System.out.println("Notification not found");
        }
    }


}

package API;

import Notification.FacebookNotification;

import java.util.List;

public class FacebookAPI {

    public List<FacebookNotification> getNotifications() {
        return List.of(
                new FacebookNotification("f1", "New friend request"),
                new FacebookNotification("f2", "Your post was liked")
        );
    }
}

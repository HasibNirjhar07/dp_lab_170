package API;

import Notification.TwitterNotification;

import java.util.List;

public class TwitterAPI {
    public List<TwitterNotification> getNotifications() {
        return List.of(
                new TwitterNotification("t1", "New follower on Twitter"),
                new TwitterNotification("t2", "Your tweet was retweeted")
        );
    }
}

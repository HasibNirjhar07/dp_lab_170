package Notification;

import Interface.NotificationService;

public class TwitterNotification implements NotificationService {

    private String id;
    private String tweet;
    private boolean read;

    public TwitterNotification(String id, String tweet) {
        this.id = id;
        this.tweet = tweet;
        this.read = false;
    }

    @Override
    public String getId() { return id; }

    @Override
    public String getMessage() { return tweet; }

    @Override
    public String getPlatform() { return "Twitter"; }

    @Override
    public boolean isRead() { return read; }

    @Override
    public void markAsRead() {
        this.read = true;
        System.out.println("Twitter notification marked as read");
    }

    @Override
    public void markAsUnread() {
        this.read = false;
        System.out.println("Twitter notification marked as unread");
    }

    @Override
    public void delete() {
        System.out.println("Twitter notification deleted");
    }
}

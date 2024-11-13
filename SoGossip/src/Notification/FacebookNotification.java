package Notification;

import Interface.NotificationService;

public class FacebookNotification implements NotificationService {

    private String id;
    private String post;
    private boolean read;

    public FacebookNotification(String id, String post) {
        this.id = id;
        this.post = post;
        this.read = false;
    }

    @Override
    public String getId() { return id; }

    @Override
    public String getMessage() { return post; }

    @Override
    public String getPlatform() { return "Facebook"; }

    @Override
    public boolean isRead() { return read; }

    @Override
    public void markAsRead() {
        this.read = true;
        System.out.println("Facebook notification marked as read");
    }

    @Override
    public void markAsUnread() {
        this.read = false;
        System.out.println("Facebook notification marked as unread");
    }

    @Override
    public void delete() {
        System.out.println("Facebook notification deleted");
    }


}

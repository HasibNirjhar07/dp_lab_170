package Interface;

public interface NotificationService {
    String getId();
    String getMessage();
    String getPlatform();
    boolean isRead();
    void markAsRead();
    void markAsUnread();
    void delete();
}

public abstract class User {
    private int id;
    private String name;
    private String location;
    private double rating;
    private NotificationService notificationService;

    public User(int id, String name, String location, double rating, NotificationService notificationService) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.notificationService = notificationService;
    }
    public abstract void recieveNotification(String message);

}

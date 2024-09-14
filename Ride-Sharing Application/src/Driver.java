public class Driver extends User
{
    private String vehicleType;
    private boolean availability;

    private double rating;

    public Driver(int id, String name, String location, double rating, NotificationService notificationService)
    {
        super(id, name, location, rating, notificationService);

        this.vehicleType=vehicleType;
        this.availability=true;

    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public double getRating()
    {
        return rating;
    }


}

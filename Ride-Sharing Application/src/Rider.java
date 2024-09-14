

public class Rider extends User
{
    private PaymentMethod preferredPaymentMethod;

    public Rider(int id, String name, String location, double rating, NotificationService notificationService, PaymentMethod preferredPaymentMethod)
    {
        super(id, name, location, rating, notificationService);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void requestRide(String pickupLocation, String dropoffLocation,RideType ride){

    }

    @Override
    public void recieveNotification(String message) {

    }
}

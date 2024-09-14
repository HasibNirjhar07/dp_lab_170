public class Trip {
    private static int tripCounter = 0;
    private int id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Driver driver;
    private Rider rider;
    private NotificationService notificationService;

    public Trip(String pickupLocation, String dropOffLocation, RideType rideType, Rider rider, NotificationService notificationService) {
        this.id = ++tripCounter;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = "Requested";
        this.rider = rider;
        this.notificationService = notificationService;
        this.fare = calculateFare();
        notificationService.sendNotification(rider, "Ride requested successfully.");
    }

    public double calculateFare() {
        // Simplified fare calculation logic based on ride type
        switch (rideType) {
            case CARPOOL:
                return 50.0;
            case LUXURY:
                return 150.0;
            case BIKE:
                return 30.0;
            default:
                return 100.0;
        }
    }

    public void assignDriver() {
        Driver driver = DriverManager.findAvailableDriver(rideType);
        if (driver != null) {
            this.driver = driver;
            driver.setAvailability(false);
            driver.acceptRide(this);
            notificationService.sendNotification(rider, "Driver found: " + driver.name);
            notificationService.sendNotification(driver, "Ride assigned to you.");
        } else {
            notificationService.sendNotification(rider, "No drivers available.");
        }
    }

    public void setStatus(String status) {
        this.status = status;
        if ("Completed".equals(status)) {
            completeTrip();
        }
    }

    public void completeTrip() {
        notificationService.sendNotification(rider, "Trip completed.");
        notificationService.sendNotification(driver, "Trip completed.");
        rider.makePayment(fare); // Use the rider's preferred payment method
        driver.setAvailability(true);
    }
}








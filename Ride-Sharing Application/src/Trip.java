public class Trip {

    private static int tripCounter=0;
    private int id;
    private String pickupLocation;
    private String dropoffLocation;
    private RideType rideType;
    private String status;
    private double fair;

    private double distance;
    private Driver driver;
    private Rider rider;
    private NotificationService notificationService;


    public  Trip(String pickupLocation, String dropoffLocation,RideType rideType,Rider rider, NotificationService notificationService){


        this.id=++tripCounter;
        this.pickupLocation=pickupLocation;
        this.dropoffLocation=dropoffLocation;
        this.rider=rider;
        this.notificationService=notificationService;
        this.fare=calculateFair();

    }



    private double calculateFair(){
        this.fair=
        return  5.00;

    }







}

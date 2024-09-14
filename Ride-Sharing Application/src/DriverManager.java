public class DriverManager {
    public static Driver findAvailableDriver(RideType rideType) {
        // Simplified logic to find available driver
        return new Driver(1, "John Doe", "Downtown", 4.5, rideType.name(), new SMSNotificationService());
    }
}
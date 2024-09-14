public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new SMSNotificationService();
        PaymentMethod paymentMethod = new CardPayment();

        Rider rider = new Rider(1, "Alice", "Uptown", 4.0, paymentMethod, notificationService);
        rider.requestRide("Uptown", "Downtown", RideType.CARPOOL);
    }
}

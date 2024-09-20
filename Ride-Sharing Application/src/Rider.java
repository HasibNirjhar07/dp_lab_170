import java.util.Scanner;

public class Rider extends User {
    private PaymentMethod preferredPaymentMethod;
    Scanner scanner=new Scanner(System.in);

    public Rider(int id, String name, String location, double rating, PaymentMethod preferredPaymentMethod, NotificationService notificationService) {
        super(id, name, location, rating, notificationService);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

     public Trip requestRide(String pickupLocation, String dropOffLocation, RideType rideType) {
         Trip trip = new Trip(pickupLocation, dropOffLocation, rideType, this);
         trip.assignDriver();
         return trip;
     }

    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void rateDriver(Driver driver, double rating) {
        driver.updateRating(rating);
    }

    public void makePayment(double amount) {
        preferredPaymentMethod.processPayment(amount);
    }

    public PaymentMethod getPrefferedPaymentMethod(){
        return preferredPaymentMethod;
    }



     @Override
     public void recieveNotification(String message) {
            notificationService.sendNotification(this, message);

     }

     public void changePaymentMethod(){

         System.out.println("Please select your payment method:");
         System.out.println("1. Card");
         System.out.println("2. Cash");
         int choice= scanner.nextInt();

         switch (choice) {
             case 1:
                 CardPayment cardPayment=new CardPayment();
                 setPreferredPaymentMethod(cardPayment);

                 System.out.println("Payment Method changed to Card Payment Successfully");


                 break;

             case 2:

                 CashPayment cashPayment=new CashPayment();
                 setPreferredPaymentMethod(cashPayment);
                 System.out.println("Payment Method changed to Cash Payment Successfully");



                 break;
             default:
                 System.out.println("Invalid option. Defaulting to Card Payment.");

                 break;
         }

     }
 }

package NotificationService;

import Interface.INotify;

public class PostalMailService {


    public void notify(String reciever,String postcode,String city,String road, String message) {
        System.out.println("Postal Mail sent to " + reciever + " with Message=" + message + " at " + postcode + " " + city + " " + road);
    }
}

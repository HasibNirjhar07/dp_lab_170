import Adapter.PostalMailAdapter;
import NotificationService.EmailNotificationService;
import NotificationService.PostalMailService;
import NotificationService.SMSNotificationService;

public class Main {

        public static void main(String[] args) {

                EmailNotificationService emailNotificationService = new EmailNotificationService();

                PostalMailService postalMailService = new PostalMailService();

                PostalMailAdapter postalMailAdapter = new PostalMailAdapter(postalMailService);



                emailNotificationService.notify("John", "Hello John, How are you?");

                postalMailAdapter.notify("John", "Hello John, How are you?");


        }
} 
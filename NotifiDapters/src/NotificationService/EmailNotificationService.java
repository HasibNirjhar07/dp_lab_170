package NotificationService;

import Interface.INotify;

public class EmailNotificationService implements INotify {
    @Override
    public void notify(String reciever, String message) {
        System.out.println("Email sent to " + reciever + " with Message=" + message);
    }
}

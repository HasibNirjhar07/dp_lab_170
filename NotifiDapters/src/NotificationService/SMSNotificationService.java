package NotificationService;

import Interface.INotify;

public class SMSNotificationService implements INotify {
    @Override
    public void notify(String reciever, String message) {
        System.out.println("SMS sent to " + reciever + " with Message=" + message);
    }
}

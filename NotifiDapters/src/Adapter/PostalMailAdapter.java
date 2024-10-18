package Adapter;

import Interface.INotify;
import NotificationService.PostalMailService;

public class PostalMailAdapter implements INotify {


    PostalMailService postalMailService;

    public PostalMailAdapter(PostalMailService postalMailService) {
        this.postalMailService = postalMailService;
    }

    @Override
    public void notify(String reciever, String message) {
        postalMailService.notify(reciever, "12345", "City", "Road", message);
    }


}

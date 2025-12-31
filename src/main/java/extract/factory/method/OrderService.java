package extract.factory.method;


import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    public void placeOrder(String order) {
        EmailSender emailSender = createEmailSender();
        emailSender.send(ORDER_PLACED + order);
    }

    protected EmailSender createEmailSender() {
        return new EmailSender();
    }
}

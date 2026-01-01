package replace.global.reference.original;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    private static final EmailSender EMAIL_SENDER = new EmailSender();

    public void placeOrder(String order) {
        EMAIL_SENDER.send(ORDER_PLACED + order);
    }
}

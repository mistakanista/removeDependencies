package replace.global.reference.resolved;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private static final EmailSender EMAIL_SENDER = new EmailSender();

    public void placeOrder(String order) {
        getEmailSender().send(ORDER_PLACED + order);
    }

    protected EmailSender getEmailSender() {
        return EMAIL_SENDER;
    }
}

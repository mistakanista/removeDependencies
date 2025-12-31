package parameterize.constructor.resolved;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private final EmailSender emailSender;

    public OrderService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }
}

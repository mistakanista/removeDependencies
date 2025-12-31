package parameterize.constructor.original;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private final EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }
}

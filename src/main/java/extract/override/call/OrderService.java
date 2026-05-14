package extract.override.call;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;


public class OrderService {

    private final EmailSender sender;

    public OrderService(EmailSender sender) {
        this.sender = sender;
    }

    public void placeOrder(String order) {
        sendEmail(ORDER_PLACED + order);
    }

    protected void sendEmail(String message) {
        sender.send(message);
    }
}

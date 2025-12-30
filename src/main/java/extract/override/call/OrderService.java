package extract.override.call;



import original.EmailSender;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

public class OrderService {

    public void placeOrder(String order) {
        sendEmail(ORDER_PLACED + order);
    }

    protected void sendEmail(String message) {
        new EmailSender().send(message);
    }
}

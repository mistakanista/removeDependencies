package pullup.feature.original;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class StoreOrderService {

    public void placeOrder(String order) {
        sendEmail("Store " + ORDER_PLACED + order);
    }

    protected void sendEmail(String message) {
        new EmailSender().send(message);
    }
}

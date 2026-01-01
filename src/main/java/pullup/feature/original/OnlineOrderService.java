package pullup.feature.original;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OnlineOrderService {

    public void placeOrder(String order) {
        sendEmail("Online " + ORDER_PLACED + order);
    }

    protected void sendEmail(String message) {
        new EmailSender().send(message);
    }
}

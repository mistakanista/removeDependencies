package parameterize.method;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    public void placeOrder(String order, EmailSender emailSender) {
        emailSender.send(ORDER_PLACED + order);
    }
}

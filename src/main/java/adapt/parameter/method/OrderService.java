package adapt.parameter.method;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    public void placeOrder(String order, EmailSender sender) {
        sender.send(ORDER_PLACED + order);
    }
}

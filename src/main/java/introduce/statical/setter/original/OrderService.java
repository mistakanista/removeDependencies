package introduce.statical.setter.original;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private static final EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }
}

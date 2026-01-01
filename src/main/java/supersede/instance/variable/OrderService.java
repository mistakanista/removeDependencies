package supersede.instance.variable;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    protected EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }
}

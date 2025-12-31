package introduce.statical.setter.resolved;

import lombok.Setter;
import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    @Setter
    private static EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }
}

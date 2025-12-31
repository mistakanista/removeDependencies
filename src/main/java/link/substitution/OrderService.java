package link.substitution;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    EmailSender emailSender = new EmailSender(); // package-private

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }
}

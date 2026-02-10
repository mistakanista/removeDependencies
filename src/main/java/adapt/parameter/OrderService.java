package adapt.parameter;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private EmailSender emailSender;

    public OrderService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public OrderService() {
    }

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }

    public void placeOrder(String order, EmailSender sender) {
        sender.send(ORDER_PLACED + order);
    }
}

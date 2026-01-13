package adapt.parameter;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private MessageSender messageSender;

    public OrderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public OrderService() {
    }

    public void placeOrder(String order) {
        // ... Bestelllogik
        messageSender.send(ORDER_PLACED + order);
    }

    public void placeOrder(String order, EmailSender sender) {
        sender.send(ORDER_PLACED + order);
    }
}

package adapt.parameter.resolved;

public class OrderService {
    public static final String ORDER_RECEIVED = "Order received: ";
    private final MessageSender messageSender;

    public OrderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void placeOrder(String order) {
        // ... Bestelllogik
        messageSender.send(ORDER_RECEIVED + order);
    }
}

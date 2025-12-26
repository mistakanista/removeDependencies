package adapt.parameter.resolved;

public class OrderService {
    private final MessageSender messageSender;

    public OrderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void placeOrder(String order) {
        // ... Bestelllogik
        messageSender.send("Order received: " + order);
    }
}

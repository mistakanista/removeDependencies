package adapt.parameter.original;

public class OrderService {
    private final EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send("Order received: " + order);
    }
}

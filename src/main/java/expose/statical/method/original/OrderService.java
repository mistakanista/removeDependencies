package expose.statical.method.original;

public class OrderService {
    public void placeOrder(String order) {
        new EmailSender().send("Order received: " + order);
    }
}

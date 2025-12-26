package definition.completion.original;

public class OrderService {

    public void placeOrder(String order) {
        EmailSender emailSender = new EmailSender();// ... Bestelllogik
        emailSender.send("Order placed: " + order);
    }
}

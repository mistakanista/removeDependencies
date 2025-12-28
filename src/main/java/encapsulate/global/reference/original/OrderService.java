package encapsulate.global.reference.original;

import adapt.parameter.original.EmailSender;

public class OrderService {
    private final EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send("Order received: " + order);
    }
}

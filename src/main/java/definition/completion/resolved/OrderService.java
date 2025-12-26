package definition.completion.resolved;

import definition.completion.original.EmailSender;

public class OrderService {


    public static final String ORDER_PLACED = "Order placed: ";

    public String placeOrder(String order) {
        EmailSender emailSender = createEmailSender();
        return emailSender.send(ORDER_PLACED + order);
    }

    protected EmailSender createEmailSender() {
        return new EmailSender();
    }
}

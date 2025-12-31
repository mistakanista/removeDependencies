package definition.completion.resolved;

import definition.completion.original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {


    public String placeOrder(String order) {
        EmailSender emailSender = createEmailSender();
        return emailSender.send(ORDER_PLACED + order);
    }

    protected EmailSender createEmailSender() {
        return new EmailSender();
    }
}

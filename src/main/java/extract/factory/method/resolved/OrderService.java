package extract.factory.method.resolved;


import original.EmailSender;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

public class OrderService {
    public void placeOrder(String order) {
        EmailSender emailSender = createEmailSender();
        emailSender.send(ORDER_PLACED + order);
    }

    protected EmailSender createEmailSender() {
        return new EmailSender();
    }
}

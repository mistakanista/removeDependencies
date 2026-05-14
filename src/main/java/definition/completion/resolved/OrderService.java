package definition.completion.resolved;

import definition.completion.original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    EmailSender emailSender;

    public String placeOrder(String order) {
        if (emailSender == null) {
            emailSender = createEmailSender();
        }
        return emailSender.send(ORDER_PLACED + order);
    }

    protected EmailSender createEmailSender() {
        return new EmailSender();
    }

    protected void createEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
}

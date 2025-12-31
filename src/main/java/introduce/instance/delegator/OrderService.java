package introduce.instance.delegator;

import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    // delegator
    private EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        emailSender.send(ORDER_PLACED + order);
    }

    // exchange point
    protected void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
}

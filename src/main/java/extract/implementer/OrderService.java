package extract.implementer;


import static original.OrderService.ORDER_PLACED;

public class OrderService {
    private final MailSender mailSender;

    public OrderService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void placeOrder(String order) {
        mailSender.send(ORDER_PLACED + order);
    }
}

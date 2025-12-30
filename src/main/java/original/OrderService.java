package original;



import static definition.completion.resolved.OrderService.ORDER_PLACED;

public class OrderService {

    public void placeOrder(String order) {
        EmailSender emailSender = new EmailSender();
        emailSender.send(ORDER_PLACED + order);
    }
}

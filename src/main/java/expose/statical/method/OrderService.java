package expose.statical.method;


import static original.OrderService.ORDER_PLACED;

public class OrderService {
    public void placeOrder(String order) {
        EmailSender.sendEmail(ORDER_PLACED + order);
    }
}

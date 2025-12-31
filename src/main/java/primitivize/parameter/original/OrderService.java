package primitivize.parameter.original;

import original.EmailSender;

public class OrderService {
    public void placeOrder(Order order) {
        sendConfirmation(order);
    }

    private void sendConfirmation(Order order) {
        new EmailSender().send(
                "Order " + order.getId() +
                        " for customer " + order.getCustomerEmail()
        );
    }
}

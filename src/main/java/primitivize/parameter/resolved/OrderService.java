package primitivize.parameter.resolved;

import original.EmailSender;
import primitivize.parameter.original.Order;

public class OrderService {
    public void placeOrder(Order order) {
        sendConfirmation(order.getId(), order.getCustomerEmail());
    }

    protected void sendConfirmation(String orderId, String customerEmail) {
        new EmailSender().send(
                "Order " + orderId + " for customer " + customerEmail
        );
    }
}

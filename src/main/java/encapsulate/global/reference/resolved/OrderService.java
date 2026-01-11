package encapsulate.global.reference.resolved;

import static original.OrderService.ORDER_PLACED;

public class OrderService {
    protected EmailGateway emailGateway() {
        return new EmailGateway();
    }

    public void placeOrder(String order) {
        emailGateway().send(ORDER_PLACED + order);
    }
}

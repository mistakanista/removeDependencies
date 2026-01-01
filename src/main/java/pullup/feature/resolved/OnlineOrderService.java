package pullup.feature.resolved;

import static original.OrderService.ORDER_PLACED;

public class OnlineOrderService extends OrderService{

    public static final String ONLINE = "Online ";

    public void placeOrder(String order) {
        sendEmail(ONLINE + ORDER_PLACED + order);
    }
}

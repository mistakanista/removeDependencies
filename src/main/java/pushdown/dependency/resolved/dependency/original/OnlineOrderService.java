package pushdown.dependency.resolved.dependency.original;

import static original.OrderService.ORDER_PLACED;
import static pullup.feature.resolved.OnlineOrderService.ONLINE;

public class OnlineOrderService extends OrderService {

    @Override
    public String  placeOrder(String order) {
        emailSender.send(ONLINE + ORDER_PLACED + order);
        return ONLINE + ORDER_PLACED + order;
    }
}

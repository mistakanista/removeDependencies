package pushdown.dependency.resolved.dependency.original;

import static original.OrderService.ORDER_PLACED;

public class InStoreOrderService extends OrderService{

    public static final String IN_STORE = "In Store ";

    @Override
    public String placeOrder(String order) {
        // No email for in-store orders
        return IN_STORE + ORDER_PLACED + order;
    }
}

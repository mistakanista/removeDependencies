package pushdown.dependency.resolved;

import org.junit.jupiter.api.Test;
import pushdown.dependency.resolved.dependency.original.InStoreOrderService;
import pushdown.dependency.resolved.dependency.original.OrderService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;
import static pushdown.dependency.resolved.dependency.original.InStoreOrderService.IN_STORE;

class PushdownDependencyTest {

    @Test
    void testInStoreOrderDoesNotSendEmail() {
        OrderService service = new InStoreOrderService();
        String order = "pushdown-dependency-123";
        String placedOrder = service.placeOrder(order);

        assertEquals(
                IN_STORE + ORDER_PLACED + order,
                placedOrder
        );
    }
}

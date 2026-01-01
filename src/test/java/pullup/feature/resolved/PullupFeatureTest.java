package pullup.feature.resolved;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;
import static pullup.feature.resolved.OnlineOrderService.ONLINE;

class PullupFeatureTest {


    @Test
    void testPullupFeature() {
        TestOrderService service = new TestOrderService();

        String order = "pullup-feature-123";
        service.placeOrder(order);

        assertEquals(
                ONLINE + ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

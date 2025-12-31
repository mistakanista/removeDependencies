package extract.override.getter.resolved;

import org.junit.jupiter.api.Test;

import static extract.override.getter.resolved.TestOrderService.TEST_USER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class OrderServiceTest {

    @Test
    void testExtractOverrideGetter() {
        OrderService service = new TestOrderService();

        String order = "override-getter-123";
        String message = service.createAuditMessage(order);

        assertEquals(
                TEST_USER + ORDER_PLACED + order,
                message
        );
    }
}

package extract.override.getter.resolved;

import org.junit.jupiter.api.Test;

import static definition.completion.resolved.OrderService.ORDER_PLACED;
import static extract.override.getter.resolved.TestOrderService.TEST_USER;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    @Test
    void testExtractOverrideGetter() {
        OrderService service = new TestOrderService();

        String order = "ABC-125";
        String message = service.createAuditMessage(order);

        assertEquals(
                TEST_USER + ORDER_PLACED + order,
                message
        );
    }
}

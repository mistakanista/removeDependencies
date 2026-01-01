package replace.global.reference.resolved;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class ReplaceGlobalReferenceTest {

    @Test
    void testReplaceGlobalReference() {
        TestOrderService service = new TestOrderService();

        String order = "replace-global-reference-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

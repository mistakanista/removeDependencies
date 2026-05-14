package encapsulate.global.reference.resolved;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class EncapsulateGlobalReferenceTest {

    @Test
    void testEncapsulateGlobalReferences() {
        TestOrderService service = new TestOrderService();

        String testOrder = "encapsulate-global-reference-123";
        service.placeOrder(testOrder);

        assertEquals(ORDER_PLACED + testOrder, service.lastMessage);
    }
}

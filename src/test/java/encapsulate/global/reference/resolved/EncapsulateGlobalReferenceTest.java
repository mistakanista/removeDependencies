package encapsulate.global.reference.resolved;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class EncapsulateGlobalReferenceTest {

    @Test
    void testEncapsulateGlobalReferencesWithoutMockito() {
        TestOrderService service = new TestOrderService();

        String testOrder = "encapsulate-wihtout-mockito-123";
        service.placeOrder(testOrder);

        assertEquals(ORDER_PLACED + testOrder, service.lastMessage);
    }
}

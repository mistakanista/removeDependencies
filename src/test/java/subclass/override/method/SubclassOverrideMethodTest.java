package subclass.override.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class SubclassOverrideMethodTest {
    @Test
    void testPlaceOrderSendsEmail() {
        TestOrderService service = new TestOrderService();

        String order = "subclass-override-method-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

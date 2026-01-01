package supersede.instance.variable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class SupersedeInstanceVariableTest {

    @Test
    void testSupersedeInstanceVariable() {
        TestOrderService service = new TestOrderService();

        String order = "supersede-instance-variable-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

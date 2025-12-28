package definition.completion.resolved;


import org.junit.jupiter.api.Test;

import static definition.completion.resolved.OrderService.ORDER_PLACED;
import static definition.completion.resolved.TestOrderService.TEST_E_MAIL_GESENDET;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    @Test
    void testDefinitionCompletion() {
        OrderService orderService = new TestOrderService();
        String testOrder = "Test order";
        String placedOrder = orderService.placeOrder(testOrder);

        assertEquals(TEST_E_MAIL_GESENDET + ORDER_PLACED + testOrder, placedOrder );
    }
}
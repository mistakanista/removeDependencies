package template.redefinition.resolved;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class TemplateRedefinitionTest {

    @Test
    void testSupersedeInstanceVariable() {
        TestOrderService service = new TestOrderService();

        String order = "template-redifinition-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.confirmationMessage
        );
    }
}

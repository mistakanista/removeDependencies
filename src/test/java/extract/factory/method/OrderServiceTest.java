package extract.factory.method;


import org.junit.jupiter.api.Test;

import static definition.completion.resolved.OrderService.ORDER_PLACED;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    @Test
    void testFactoryMethod() {
        TestOrderService service = new TestOrderService();

        String order = "ABC-124";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

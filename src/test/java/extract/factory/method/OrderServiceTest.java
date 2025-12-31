package extract.factory.method;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class OrderServiceTest {

    @Test
    void testFactoryMethod() {
        TestOrderService service = new TestOrderService();

        String order = "factory-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

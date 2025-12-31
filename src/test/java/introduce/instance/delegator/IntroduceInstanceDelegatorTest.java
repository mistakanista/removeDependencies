package introduce.instance.delegator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class IntroduceInstanceDelegatorTest {

    @Test
    void testPlaceOrderSendsEmail() {
        TestOrderService service = new TestOrderService();

        String order = "introduce-instance-delegator-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

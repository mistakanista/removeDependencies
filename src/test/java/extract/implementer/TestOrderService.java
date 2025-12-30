package extract.implementer;

import org.junit.jupiter.api.Test;

import static definition.completion.resolved.OrderService.ORDER_PLACED;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestOrderService {

    @Test
    void testExtractImplementer() {
        FakeMailSender fakeSender = new FakeMailSender();
        OrderService service = new OrderService(fakeSender);

        String order = "Implementer-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                fakeSender.lastMessage
        );
    }
}

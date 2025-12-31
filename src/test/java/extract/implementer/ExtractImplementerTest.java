package extract.implementer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class ExtractImplementerTest {

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

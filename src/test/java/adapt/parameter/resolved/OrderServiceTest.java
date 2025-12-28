package adapt.parameter.resolved;

import org.junit.jupiter.api.Test;

import static adapt.parameter.resolved.OrderService.ORDER_RECEIVED;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {
    static class DummySender implements MessageSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    @Test
    void testAdaptParameter() {
        DummySender dummySender = new DummySender();
        OrderService service = new OrderService(dummySender);

        String testOrder = "Test order";
        service.placeOrder(testOrder);

        assertEquals(ORDER_RECEIVED + testOrder, dummySender.lastMessage);
    }
}
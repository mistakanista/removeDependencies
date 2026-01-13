package adapt.parameter;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class AdaptParameterTest {
    static class DummySender implements MessageSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    static class FakeSender extends EmailSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    @Test
    void testAdaptParameterConstructorParameter() {
        DummySender dummySender = new DummySender();
        OrderService service = new OrderService(dummySender);

        String testOrder = "adapt-constructor-123";
        service.placeOrder(testOrder);

        assertEquals(ORDER_PLACED + testOrder, dummySender.lastMessage);

    }

    @Test
    void testAdaptParameterMethodParameter() {

        FakeSender fakeSender = new FakeSender();

        OrderService service = new OrderService();
        String testOrder = "adapt-method-123";
        service.placeOrder(testOrder, fakeSender);

        assertEquals(ORDER_PLACED + testOrder, fakeSender.lastMessage);

    }
}
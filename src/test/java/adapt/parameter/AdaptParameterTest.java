package adapt.parameter;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class AdaptParameterTest {
    static class AdaptConstructorSender implements MessageSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    static class AdaptMethodSender extends EmailSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    @Test
    void testAdaptParameterConstructorParameter() {
        AdaptConstructorSender adaptConstructorSender = new AdaptConstructorSender();
        OrderService service = new OrderService(adaptConstructorSender);

        String testOrder = "adapt-constructor-123";
        service.placeOrder(testOrder);

        assertEquals(ORDER_PLACED + testOrder, adaptConstructorSender.lastMessage);

    }

    @Test
    void testAdaptParameterMethodParameter() {

        AdaptMethodSender adaptMethodSender = new AdaptMethodSender();

        OrderService service = new OrderService();
        String testOrder = "adapt-method-123";
        service.placeOrder(testOrder, adaptMethodSender);

        assertEquals(ORDER_PLACED + testOrder, adaptMethodSender.lastMessage);

    }
}
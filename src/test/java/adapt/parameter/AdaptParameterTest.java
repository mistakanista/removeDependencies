package adapt.parameter;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class AdaptParameterTest {
    static class TestSender extends EmailSender {
        String lastMessage;
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    }

    @Test
    void testAdaptParameterConstructorParameter() {
        TestSender testSender = new TestSender();
        OrderService service = new OrderService(testSender);

        String testOrder = "adapt-constructor-123";
        service.placeOrder(testOrder);

        assertEquals(ORDER_PLACED + testOrder, testSender.lastMessage);

    }

    @Test
    void testAdaptParameterMethodParameter() {

        TestSender testSender = new TestSender();

        OrderService service = new OrderService();
        String testOrder = "adapt-method-123";
        service.placeOrder(testOrder, testSender);

        assertEquals(ORDER_PLACED + testOrder, testSender.lastMessage);

    }
}
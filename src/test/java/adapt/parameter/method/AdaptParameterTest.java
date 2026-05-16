package adapt.parameter.method;

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
    void adaptParameterMethodParameter() {

        TestSender testSender = new TestSender();

        OrderService service = new OrderService();
        String testOrder = "adapt-method-123";
        service.placeOrder(testOrder, testSender);

        assertEquals(ORDER_PLACED + testOrder, testSender.lastMessage);

    }
}
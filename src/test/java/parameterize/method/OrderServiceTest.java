package parameterize.method;

import org.junit.jupiter.api.Test;
import original.EmailSender;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class OrderServiceTest {

    private String lastMessage;

    @Test
    void testParameterizeMethod() {
        EmailSender testSender = new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        };

        OrderService service = new OrderService();

        String order = "parameterize-method-123";
        service.placeOrder(order, testSender);

        assertEquals(ORDER_PLACED + order, lastMessage);
    }
}

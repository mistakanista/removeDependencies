package introduce.statical.setter.resolved;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class OrderServiceTest {

    private static String lastMessage;

    @BeforeEach
    void setUp() {
        OrderService.setEmailSender(new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        });
    }

    @AfterEach
    void tearDown() {
        // important to reset static state after test
        OrderService.setEmailSender(new EmailSender());
    }

    @Test
    void testPlaceOrderSendsEmail() {
        OrderService service = new OrderService();

        String order = "introduce-static-setter-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                lastMessage
        );
    }
}

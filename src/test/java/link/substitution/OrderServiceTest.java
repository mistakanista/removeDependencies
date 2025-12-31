package link.substitution;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class OrderServiceTest {
    private String lastMessage;

    @Test
    void testPlaceOrderSendsEmail() {
        OrderService service = new OrderService();

        // 🔁 Link Substitution
        service.emailSender = new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        };
        String order = "link-substitution-123";
        service.placeOrder(order);

        assertEquals(ORDER_PLACED + order, lastMessage);
    }
}

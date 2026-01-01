package textual.redefinition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class TextualRedefinitionTest {

    @Test
    void testTextualRedefinition() {
        OrderService service = new OrderService();

        String order = "textual-redifinition-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                EmailSender.lastMessage
        );
    }
}

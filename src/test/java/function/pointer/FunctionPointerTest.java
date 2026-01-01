package function.pointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class FunctionPointerTest {
    private String lastMessage;

    @Test
    void testFunctionPointer() {
        OrderService service = new OrderService();

        service.setSendEmail(message -> lastMessage = message);

        String order = "function-pointer-123";
        service.placeOrder(order);

        assertEquals(ORDER_PLACED + order, lastMessage);
    }
}

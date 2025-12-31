package extract.iface;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class ExtractInterfaceTest {
    @Test
    void testExtractInterface() {
        FakeEmailSender fakeSender = new FakeEmailSender();
        OrderService service = new OrderService(fakeSender);

        String order = "Interface-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                fakeSender.lastMessage
        );
    }
}

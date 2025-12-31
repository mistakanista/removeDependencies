package extract.override.call;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class ExtractOverrideCallTest {

    @Test
    void testExtractOverrideCall() {
        TestOrderService service = new TestOrderService();

        String order = "override-call-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                service.lastMessage
        );
    }
}

package primitivize.parameter.resolved;

import org.junit.jupiter.api.Test;
import primitivize.parameter.original.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimitivizeParameterTest {

    private String lastMessage;

    @Test
    void testSendConfirmation() {
        OrderService service = new OrderService() {
            @Override
            protected void sendConfirmation(String orderId, String email) {
                lastMessage = "Order " + orderId + " for customer " + email;
            }
        };

        String email = "test@example.com";
        String order = "primitivize-parameter-123";
        service.placeOrder(new Order(order, email));

        assertEquals(
                "Order " + order + " for customer " + email,
                lastMessage
        );
    }
}

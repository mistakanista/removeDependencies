package expose.statical.method.resolved;



import org.junit.jupiter.api.Test;

import static definition.completion.resolved.OrderService.ORDER_PLACED;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    @Test
    void testExposeStaticMethod() {
        FakeEmailSender fakeSender = new FakeEmailSender();

        //redirect static method to fake sender
        EmailSender.setInstance(fakeSender);

        OrderService service = new OrderService();
        String order = "ABC-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                fakeSender.lastMessage
        );
    }
}

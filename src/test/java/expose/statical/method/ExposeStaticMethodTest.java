package expose.statical.method;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static original.OrderService.ORDER_PLACED;

class ExposeStaticMethodTest {

    @Test
    void testExposeStaticMethod() {
        FakeEmailSender fakeSender = new FakeEmailSender();

        //redirect static method to fake sender
        EmailSender.setInstance(fakeSender);

        OrderService service = new OrderService();
        String order = "expose-123";
        service.placeOrder(order);

        assertEquals(
                ORDER_PLACED + order,
                fakeSender.lastMessage
        );
    }
}

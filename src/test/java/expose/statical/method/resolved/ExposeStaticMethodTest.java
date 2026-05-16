package expose.statical.method.resolved;



import expose.statical.method.OrderService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class ExposeStaticMethodTest {

    @Test
    void exposeStaticMethodMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        EmailSender.setInstance(mockSender);

        OrderService service = new OrderService();
        String order = "expose-123-mockito";

        service.placeOrder(order);

        verify(mockSender).send(ORDER_PLACED + order);

    }
}

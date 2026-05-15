package parameterize.method;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class ParameterizeMethodTest {

    @Test
    void testParameterizeMethodMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService();

        String order = "parameterize-method-123-mockito";
        service.placeOrder(order, mockSender);

        verify(mockSender).send(ORDER_PLACED + order);
    }
}

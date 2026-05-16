package parameterize.constructor.resolved;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class ParameterizeConstructorTest {

    @Test
    void parameterizeConstructorMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService(mockSender);

        String order = "parameterize-constructor-123-mockito";
        service.placeOrder(order);

        verify(mockSender).send(ORDER_PLACED + order);
    }
}

package adapt.parameter.method;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class AdaptParameterTest {


    @Test
    void adaptParameterMethodParameterMockito() {

        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService();

        String testOrder = "adapt-method-123-mock";
        service.placeOrder(testOrder, mockSender);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}
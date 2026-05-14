package adapt.parameter.constructor;


import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class AdaptParameterTest {

    @Test
    void testAdaptParameterConstructorParameterMockito() {

        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService(mockSender);

        String testOrder = "adapt-constructor-123-mock";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}
package introduce.instance.delegator;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class IntroduceInstanceDelegatorTest {

    @Test
    void testDefinitionCompletionMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService orderService = new OrderService();
        orderService.setEmailSender(mockSender);

        String testOrder = "introduce-instance-delegator-123-mockito";
        orderService.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);

    }
}

package introduce.statical.setter.resolved;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class IntroduceStaticSetterTest {

    @Test
    void testIntroduceStaticSetterMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService orderService = new OrderService();
        OrderService.setEmailSender(mockSender);

        String testOrder = "introduce-static-setter-123-mockito";
        orderService.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);

    }
}

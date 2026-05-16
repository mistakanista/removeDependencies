package supersede.instance.variable;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class SupersedeInstanceVariableTest {

    @Test
    void testSupersedeInstanceVariable() {

        EmailSender sender =
                mock(EmailSender.class);

        OrderService service =
                new TestOrderService(sender);

        String order = "supersede-instance-variable-123-mockito";

        service.placeOrder(order);

        verify(sender).send(ORDER_PLACED + order);
    }
}

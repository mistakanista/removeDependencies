package extract.factory.method;


import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class ExtractFactoryMethodTest {

    @Test
    void testFactoryMethod() {

        EmailSender sender =
                mock(EmailSender.class);

        EmailSenderFactory factory =
                mock(EmailSenderFactory.class);

        when(factory.create())
                .thenReturn(sender);

        OrderService service = new OrderService(factory);
        String order = "factory-123-mockito";
        service.placeOrder(order);

        verify(sender)
                .send(ORDER_PLACED + order);
    }
}

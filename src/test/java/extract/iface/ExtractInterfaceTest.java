package extract.iface;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class ExtractInterfaceTest {

    @Test
    void extractInterfaceMockito() {

        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService(mockSender);

        String testOrder = "Interface-123-mockito";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}

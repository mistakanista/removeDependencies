package extract.implementer;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class ExtractImplementerTest {

    @Test
    void extractInterfaceMockito() {

        MailSender mockSender = mock(MailSender.class);
        OrderService service = new OrderService(mockSender);

        String testOrder = "Implementer-123-mockito";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}

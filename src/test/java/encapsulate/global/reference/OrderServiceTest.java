package encapsulate.global.reference;


import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class OrderServiceTest {

    @Test
    void testEncapsulateGlobalReference() {
        EmailSender mockSender = mock(EmailSender.class);

        OrderService service = new OrderService();
        service.setEmailSender(mockSender);
        String testOrder = "encapsulate-123";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}

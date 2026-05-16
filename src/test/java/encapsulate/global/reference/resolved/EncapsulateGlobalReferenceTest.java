package encapsulate.global.reference.resolved;


import encapsulate.global.reference.OrderService;
import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class EncapsulateGlobalReferenceTest {

    @Test
    void encapsulateGlobalReference() {
        EmailSender mockSender = mock(EmailSender.class);

        encapsulate.global.reference.OrderService service = new OrderService();
        service.setEmailSender(mockSender);
        String testOrder = "encapsulate-123";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}

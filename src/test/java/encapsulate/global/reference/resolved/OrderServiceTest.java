package encapsulate.global.reference.resolved;

import encapsulate.global.reference.original.EmailSender;
import org.junit.jupiter.api.Test;

import static definition.completion.resolved.OrderService.ORDER_PLACED;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OrderServiceTest {

    @Test
    void testEncapsulateGlobalReference() {
        EmailSender mockSender = mock(EmailSender.class);

        OrderService service = new OrderService();
        service.setEmailSender(mockSender);
        String testOrder = "TestOrder";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}

package replace.global.reference.resolved;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class ReplaceGlobalReferenceTest {

    @Test
    void replaceGlobalReferenceMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = spy(new OrderService());

        doReturn(mockSender)
                .when(service)
                .getEmailSender();

        String order = "replace-global-reference-123-mockito";

        service.placeOrder(order);

        verify(mockSender).send(ORDER_PLACED + order);
    }
}

package extract.override.call;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class ExtractOverrideCallTest {


    @Test
    void testExtractOverrideCallMockito() {

        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService(mockSender);

        String testOrder = "override-call-123-mockito";
        service.placeOrder(testOrder);

        verify(mockSender).send(ORDER_PLACED + testOrder);
    }
}

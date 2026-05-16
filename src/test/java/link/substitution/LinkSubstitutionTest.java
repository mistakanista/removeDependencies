package link.substitution;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class LinkSubstitutionTest {

    @Test
    void linkSubstitutionMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService service = new OrderService();

        // Link Substitution
        service.emailSender = mockSender;
        String order = "link-substitution-123-mockito";
        service.placeOrder(order);

        verify(mockSender).send(ORDER_PLACED + order);
    }
}

package breakout.methodobject.resolved;

import org.junit.jupiter.api.Test;
import original.EmailSender;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BreakoutMethodObjectTest {

    @Test
    void testBreakoutMethodObjectMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        String order = "breakout-methodobject-123-mockito";
        String email = "test@example.com";
        PlaceOrderMethod method =
                new PlaceOrderMethod(order, email, mockSender);

        method.execute();

        verify(mockSender).send("Order " + order + " for customer " + email);
    }
}

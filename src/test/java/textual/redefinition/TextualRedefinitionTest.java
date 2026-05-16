package textual.redefinition;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class TextualRedefinitionTest {

    @Test
    void testTextualRedefinitionMockito() {

        try (MockedConstruction<EmailSender> mocked =
                     mockConstruction(EmailSender.class)) {

            OrderService service =
                    new OrderService();

            String order =
                    "textual-redefinition-123";

            service.placeOrder(order);

            EmailSender mockSender =
                    mocked.constructed().getFirst();

            verify(mockSender)
                    .send(
                            ORDER_PLACED + order
                    );
        }
    }
}

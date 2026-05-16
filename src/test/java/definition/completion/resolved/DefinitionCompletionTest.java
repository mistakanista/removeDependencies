package definition.completion.resolved;

import definition.completion.original.EmailSender;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static original.OrderService.ORDER_PLACED;

class DefinitionCompletionTest {

    @Test
    void definitionCompletionMockito() {
        EmailSender mockSender = mock(EmailSender.class);
        OrderService orderService = new OrderService();
        orderService.createEmailSender(mockSender);

        String testOrder = "definition-123-mockito";
        when(mockSender.send(anyString())).thenReturn(ORDER_PLACED + testOrder);
        String placedOrder = orderService.placeOrder(testOrder);

        assertEquals(ORDER_PLACED + testOrder, placedOrder );

    }
}
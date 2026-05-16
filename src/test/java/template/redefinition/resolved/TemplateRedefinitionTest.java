package template.redefinition.resolved;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class TemplateRedefinitionTest {

    @Test
    void templateRedefinitionMockito() {

        OrderService service =
                spy(new OrderService());

        doNothing()
                .when(service)
                .sendConfirmation(
                        anyString()
                );
        String order = "template-redifinition-123-mockito";

        service.placeOrder(order);

        verify(service)
                .sendConfirmation(order);
    }
}

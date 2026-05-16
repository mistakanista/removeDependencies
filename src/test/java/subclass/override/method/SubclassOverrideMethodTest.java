package subclass.override.method;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class SubclassOverrideMethodTest {

    @Test
    void testSubclassOverrideMethodMockito() {

        OrderService service =
                spy(new OrderService());

        doNothing()
                .when(service)
                .sendEmail(
                        anyString()
                );
        String order = "subclass-override-method-123-mockito";

        service.placeOrder(order);

        verify(service)
                .sendEmail(ORDER_PLACED + order);
    }
}

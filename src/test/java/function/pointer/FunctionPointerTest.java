package function.pointer;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static original.OrderService.ORDER_PLACED;

class FunctionPointerTest {

    @Test
    void testFunctionPointerMockito() {

        Consumer<String> sendEmail =
                mock(Consumer.class);

        OrderService service =
                new OrderService(sendEmail);
        String order = "function-pointer-123-mockito";

        service.placeOrder(order);

        verify(sendEmail)
                .accept(ORDER_PLACED + order);
    }
}

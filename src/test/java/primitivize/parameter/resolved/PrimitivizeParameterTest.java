package primitivize.parameter.resolved;

import org.junit.jupiter.api.Test;

import primitivize.parameter.original.Order;

import static org.mockito.Mockito.*;

class PrimitivizeParameterTest {

    @Test
    void primitivizeParameterMockito() {

        OrderService service = spy(new OrderService());

        doNothing()
                .when(service)
                .sendConfirmation(
                        anyString(),
                        anyString()
                );
        String email = "test@example.com";
        String message = "primitivize-parameter-123-mockito";
        Order order = new Order(message, email);

        service.placeOrder(order);

        verify(service)
                .sendConfirmation(
                        message,
                        email
                );
    }
}

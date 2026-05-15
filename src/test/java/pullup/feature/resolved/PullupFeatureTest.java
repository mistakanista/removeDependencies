package pullup.feature.resolved;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.doNothing;
import static original.OrderService.ORDER_PLACED;
import static pullup.feature.resolved.OnlineOrderService.ONLINE;

class PullupFeatureTest {

    @Test
    void testPullupFeatureMockito() {
        OnlineOrderService service =
                spy(new OnlineOrderService());

        doNothing()
                .when(service)
                .sendEmail(
                        anyString()
                );
        String order = "pullup-feature-123-mockito";

        service.placeOrder(order);

        verify(service)
                .sendEmail(
                        ONLINE + ORDER_PLACED + order
                );
    }
}

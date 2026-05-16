package extract.override.getter.resolved;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static original.OrderService.ORDER_PLACED;

class ExtractGetterTest {

    public static final String TEST_USER = "TEST-USER";

    @Test
    void extractOverrideGetterMockito() {

        OrderService service = spy(new OrderService());
        String order = "override-getter-123-mockito";

        doReturn(TEST_USER)
                .when(service)
                .getSystemUser();

        String result = service.createAuditMessage(order);

        assertEquals(
                TEST_USER + ORDER_PLACED + order,
                result
        );
    }
}

package extract.override.getter.original;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

public class OrderService {

    private static final String SYSTEM_USER = "SYSTEM";

    public String createAuditMessage(String order) {
        return SYSTEM_USER + ORDER_PLACED + order;
    }
}

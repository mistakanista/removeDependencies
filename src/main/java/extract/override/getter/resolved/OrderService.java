package extract.override.getter.resolved;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

public class OrderService {
    private static final String SYSTEM_USER = "SYSTEM";

    public String createAuditMessage(String order) {
        return getSystemUser() + ORDER_PLACED + order;
    }

    protected String getSystemUser() {
        return SYSTEM_USER;
    }
}

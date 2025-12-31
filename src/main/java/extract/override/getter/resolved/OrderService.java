package extract.override.getter.resolved;

import static extract.override.getter.original.OrderService.SYSTEM_USER;
import static original.OrderService.ORDER_PLACED;

public class OrderService {


    public String createAuditMessage(String order) {
        return getSystemUser() + ORDER_PLACED + order;
    }

    protected String getSystemUser() {
        return SYSTEM_USER;
    }
}

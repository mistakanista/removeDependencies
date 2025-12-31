package extract.override.getter.original;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    public static final String SYSTEM_USER = "SYSTEM";

    public String createAuditMessage(String order) {
        return SYSTEM_USER + ORDER_PLACED + order;
    }
}

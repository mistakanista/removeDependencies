package extract.override.getter.resolved;

public class TestOrderService extends OrderService {

    public static final String TEST_USER = "TEST-USER";

    @Override
    protected String getSystemUser() {
        return TEST_USER;
    }
}

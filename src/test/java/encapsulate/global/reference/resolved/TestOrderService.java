package encapsulate.global.reference.resolved;

public class TestOrderService extends OrderService {

    String lastMessage;

    @Override
    protected EmailGateway emailGateway() {
        return new EmailGateway() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        };
    }
}

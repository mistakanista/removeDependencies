package subclass.override.method;


class TestOrderService extends OrderService {

    String lastMessage;

    @Override
    protected void sendEmail(String message) {
        lastMessage = message;
    }
}

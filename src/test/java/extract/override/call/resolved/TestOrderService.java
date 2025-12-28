package extract.override.call.resolved;

class TestOrderService extends OrderService {

    String lastMessage;

    @Override
    protected void sendEmail(String message) {
        this.lastMessage = message;
    }
}

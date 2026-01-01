package pullup.feature.resolved;

class TestOrderService extends OnlineOrderService {

    String lastMessage;

    @Override
    protected void sendEmail(String message) {
        lastMessage = message;
    }
}

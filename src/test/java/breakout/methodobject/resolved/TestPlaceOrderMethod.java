package breakout.methodobject.resolved;

import original.EmailSender;

public class TestPlaceOrderMethod extends PlaceOrderMethod {

    String lastMessage;

    TestPlaceOrderMethod(String order, String email) {
        super(order, email);
    }

    @Override
    protected EmailSender createEmailSender() {
        return new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        };
    }
}

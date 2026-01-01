package replace.global.reference.resolved;

import original.EmailSender;

public class TestOrderService extends OrderService{
    String lastMessage;

    @Override
    protected EmailSender getEmailSender() {
        return new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        };
    }
}

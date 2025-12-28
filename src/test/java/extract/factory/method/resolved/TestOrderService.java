package extract.factory.method.resolved;

import extract.factory.method.original.EmailSender;

class TestOrderService extends OrderService {

    EmailSender testSender = new EmailSender() {
        @Override
        public void send(String message) {
            lastMessage = message;
        }
    };

    String lastMessage;

    @Override
    protected EmailSender createEmailSender() {
        return testSender;
    }
}


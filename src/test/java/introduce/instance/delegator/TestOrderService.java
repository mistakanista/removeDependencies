package introduce.instance.delegator;

import original.EmailSender;

class TestOrderService extends OrderService {

    String lastMessage;

    TestOrderService() {
        setEmailSender(new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        });
    }
}


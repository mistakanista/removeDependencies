package supersede.instance.variable;

import original.EmailSender;

public class TestOrderService extends OrderService{
    String lastMessage;

    TestOrderService() {
        //supersede instance variable
        this.emailSender = new EmailSender() {
            @Override
            public void send(String message) {
                lastMessage = message;
            }
        };
    }
}

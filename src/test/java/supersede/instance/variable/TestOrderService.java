package supersede.instance.variable;

import original.EmailSender;

public class TestOrderService extends OrderService{

    TestOrderService(EmailSender sender) {
        //supersede instance variable
        this.emailSender = sender;
    }
}

package pushdown.dependency.resolved.dependency.original;

import original.EmailSender;

public abstract class OrderService {

    protected final EmailSender emailSender = new EmailSender();

    public abstract String placeOrder(String order);
}

package extract.factory.method;


import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    private final EmailSenderFactory factory;

    public OrderService(
            EmailSenderFactory factory) {

        this.factory = factory;
    }

    public void placeOrder(String order) {

        EmailSender emailSender =
                factory.create();

        emailSender.send(
                ORDER_PLACED + order
        );
    }
}

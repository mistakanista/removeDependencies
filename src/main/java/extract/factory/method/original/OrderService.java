package extract.factory.method.original;

import extract.override.call.original.EmailSender;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

public class OrderService {

    public void placeOrder(String order) {
        extract.override.call.original.EmailSender emailSender = new EmailSender();
        emailSender.send(ORDER_PLACED + order);
    }
}

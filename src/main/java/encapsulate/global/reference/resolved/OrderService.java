package encapsulate.global.reference.resolved;

import encapsulate.global.reference.original.EmailSender;
import lombok.Data;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

@Data
public class OrderService {
    private EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        getEmailSender().send(ORDER_PLACED + order);
    }
}

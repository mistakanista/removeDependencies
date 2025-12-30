package encapsulate.global.reference;

import lombok.Data;
import original.EmailSender;

import static definition.completion.resolved.OrderService.ORDER_PLACED;

@Data
public class OrderService {
    private EmailSender emailSender = new EmailSender();

    public void placeOrder(String order) {
        getEmailSender().send(ORDER_PLACED + order);
    }
}

package breakout.methodobject.resolved;

import lombok.extern.slf4j.Slf4j;
import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

@Slf4j
public class PlaceOrderMethod {
    private final String order;
    private final String email;
    private EmailSender sender;

    PlaceOrderMethod(String order, String email) {
        this.order = order;
        this.email = email;
    }

    PlaceOrderMethod(String order, String email, EmailSender sender) {
        this.order = order;
        this.email = email;
        this.sender = sender;
    }



    public void execute() {
        if (order == null || order.isBlank()) {
            throw new IllegalArgumentException("Invalid order");
        }

        if (sender == null) {
            sender = createEmailSender();
        }
        sender.send("Order " + order + " for customer " + email);

        log.info(ORDER_PLACED + order);
    }

    protected EmailSender createEmailSender() {

        return new EmailSender();
    }
}

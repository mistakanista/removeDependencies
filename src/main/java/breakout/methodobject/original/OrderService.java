package breakout.methodobject.original;

import lombok.extern.slf4j.Slf4j;
import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

@Slf4j
public class OrderService {
    public void placeOrder(String order, String email) {
        // business logic
        if (order == null || order.isBlank()) {
            throw new IllegalArgumentException("Invalid order");
        }

        // external dependency
        EmailSender sender = new EmailSender();
        sender.send("Order " + order + " for customer " + email);

        // more logic
        log.info(ORDER_PLACED + order);
    }
}

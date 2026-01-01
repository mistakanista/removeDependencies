package template.redefinition.resolved;

import lombok.extern.slf4j.Slf4j;
import original.EmailSender;

import static original.OrderService.ORDER_PLACED;

@Slf4j
public class OrderService {

    // Template method
    public void placeOrder(String order) {
        validate(order);
        sendConfirmation(order);
        logOrder(order);
    }

    protected void sendConfirmation(String order) {
        new EmailSender().send(ORDER_PLACED + order);
    }

    private void validate(String order) {
        // validation logic
        log.info("validating order: {}", order);

    }

    private void logOrder(String order) {
        // logging logic
        log.info("logging order: {}", order);
    }
}

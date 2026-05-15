package function.pointer;

import original.EmailSender;

import java.util.function.Consumer;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    private final Consumer<String> sendEmail;

    public OrderService() {
        this.sendEmail = this::realSendEmail;
    }

    // constructor for tests
    public OrderService(
            Consumer<String> sendEmail) {

        this.sendEmail = sendEmail;
    }

    public void placeOrder(String order) {

        sendEmail.accept(
                ORDER_PLACED + order
        );
    }

    private void realSendEmail(
            String message) {

        new EmailSender().send(message);
    }
}

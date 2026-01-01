package function.pointer;

import original.EmailSender;

import java.util.function.Consumer;

import static original.OrderService.ORDER_PLACED;

public class OrderService {

    private Consumer<String> sendEmail = this::realSendEmail;

    public void placeOrder(String order) {
        sendEmail.accept(ORDER_PLACED + order);
    }

    private void realSendEmail(String message) {
        new EmailSender().send(message);
    }

    // exchangeable behavior for testing
    protected void setSendEmail(Consumer<String> sendEmail) {
        this.sendEmail = sendEmail;
    }
}

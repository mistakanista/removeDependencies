package pullup.feature.resolved;

import original.EmailSender;

public abstract class OrderService {

    protected void sendEmail(String message) {
        new EmailSender().send(message);
    }
}

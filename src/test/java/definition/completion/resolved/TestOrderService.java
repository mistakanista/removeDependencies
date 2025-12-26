package definition.completion.resolved;

import definition.completion.original.EmailSender;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestOrderService extends OrderService {

    public static final String TEST_E_MAIL_GESENDET = "Test E-Mail gesendet: ";

    @Override
    public EmailSender createEmailSender() {
        return new EmailSender() {
            @Override
            public String send(String message) {
                return TEST_E_MAIL_GESENDET + message;
            }
        };
    }

}

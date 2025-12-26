package adapt.parameter.resolved;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailSender implements MessageSender {


    @Override
    public void send(String message) {
        log.info("Email sent: {}", message);
    }
}

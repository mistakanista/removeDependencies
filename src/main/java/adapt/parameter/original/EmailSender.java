package adapt.parameter.original;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailSender {

    public void send(String message) {
        log.info("E-Mail gesendet: {}", message);
    }
}

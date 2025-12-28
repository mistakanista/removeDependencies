package encapsulate.global.reference.original;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailSender {

    public void send(String message) {
        log.info("E-Mail sent: {}", message);
    }
}

package extract.iface;

import static original.EmailSender.EXTERNAL_SERVICE_NOT_IMPLEMENTED;

public class SmtpEmailSender implements EmailSender {

    @Override
    public void send(String message) {
        throw new UnsupportedOperationException(EXTERNAL_SERVICE_NOT_IMPLEMENTED);
    }
}

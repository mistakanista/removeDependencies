package extract.factory.method;

import original.EmailSender;

public class DefaultEmailSenderFactory implements EmailSenderFactory {

    @Override
    public EmailSender create() {
        return new EmailSender();
    }
}

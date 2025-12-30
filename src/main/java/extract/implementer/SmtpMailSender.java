package extract.implementer;

public class SmtpMailSender implements MailSender{
    @Override
    public void send(String message) {
        throw new UnsupportedOperationException("external service not implemented");
    }
}

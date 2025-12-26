package adapt.parameter.resolved;

public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("E-Mail gesendet: " + message);
    }
}

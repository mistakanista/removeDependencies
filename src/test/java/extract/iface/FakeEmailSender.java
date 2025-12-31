package extract.iface;

public class FakeEmailSender implements EmailSender{
    String lastMessage;

    @Override
    public void send(String message) {
        this.lastMessage = message;
    }
}

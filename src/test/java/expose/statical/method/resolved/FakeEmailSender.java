package expose.statical.method.resolved;

public class FakeEmailSender extends EmailSender {

    String lastMessage;

    @Override
    protected void send(String message) {
        this.lastMessage = message;
    }
}

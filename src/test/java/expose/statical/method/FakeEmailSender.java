package expose.statical.method;

public class FakeEmailSender extends EmailSender {

    String lastMessage;

    @Override
    protected void send(String message) {
        this.lastMessage = message;
    }
}

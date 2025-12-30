package extract.implementer;

class FakeMailSender implements MailSender {

    String lastMessage;

    @Override
    public void send(String message) {
        this.lastMessage = message;
    }
}

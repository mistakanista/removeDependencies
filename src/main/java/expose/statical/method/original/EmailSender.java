package expose.statical.method.original;

public class EmailSender {

    // global Static Instance
    private static EmailSender instance = new EmailSender();

    // implementation
    protected void send(String message) {
        throw new UnsupportedOperationException("external service not implemented");
    }
}

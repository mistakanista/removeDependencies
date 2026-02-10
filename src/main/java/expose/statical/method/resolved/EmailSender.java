package expose.statical.method.resolved;

public class EmailSender {

    // global Static Instance
    private static EmailSender instance = new EmailSender();

    // Exposed static method
    public static void sendEmail(String message) {
        instance.send(message);
    }

    // exchange point for Tests
    static void setInstance(EmailSender sender) {
        instance = sender;
    }

    // implementation
    protected void send(String message) {
        throw new UnsupportedOperationException("external service not implemented");
    }
}

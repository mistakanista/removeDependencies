package expose.statical.method.resolved;

public class EmailSender {

    // global Static Instance
    private static EmailSender instance = new EmailSender();

    // Exposed static method
    public static void sendEmail(String message) {
        instance.send(message);
    }

    // Austauschpunkt für Tests
    static void setInstance(EmailSender sender) {
        instance = sender;
    }

    // eigentliche Implementierung
    protected void send(String message) {
        throw new UnsupportedOperationException("external service not implemented");
    }
}

package expose.statical.method.original;

public class EmailSender {

    // eigentliche Implementierung
    protected void send(String message) {
        throw new UnsupportedOperationException("external service not implemented");
    }
}

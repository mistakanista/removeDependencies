package extract.factory.method.original;

public class EmailSender {

    public void send(String message) {
        throw new UnsupportedOperationException("external service not implemented");
    }
}

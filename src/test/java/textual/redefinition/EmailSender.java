package textual.redefinition;

public class EmailSender {

    public static String lastMessage;

    public void send(String message) {
        lastMessage = message;
    }
}

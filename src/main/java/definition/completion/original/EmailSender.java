package definition.completion.original;

import static original.EmailSender.EXTERNAL_SERVICE_NOT_IMPLEMENTED;

public class EmailSender {
    public String send(String message) {

        throw new UnsupportedOperationException(EXTERNAL_SERVICE_NOT_IMPLEMENTED);
    }
}

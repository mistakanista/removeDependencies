package encapsulate.global.reference.originial;

import static original.EmailSender.EXTERNAL_SERVICE_NOT_IMPLEMENTED;

public class EmailSystem {

    private EmailSystem(){
    }

    public static void send(String message) {
        throw new UnsupportedOperationException(EXTERNAL_SERVICE_NOT_IMPLEMENTED);
    }
}

package extract.factory.method;

import original.EmailSender;

public interface EmailSenderFactory {

    EmailSender create();
}

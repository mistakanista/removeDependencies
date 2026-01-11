package encapsulate.global.reference.resolved;

import encapsulate.global.reference.originial.EmailSystem;

public class EmailGateway {

    public void send(String message) {
        EmailSystem.send(message);
    }
}

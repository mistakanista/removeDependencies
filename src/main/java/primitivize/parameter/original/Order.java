package primitivize.parameter.original;

import lombok.Getter;

@Getter
public class Order {

    private final String id;
    private final String customerEmail;

    public Order(String id, String customerEmail) {
        this.id = id;
        this.customerEmail = customerEmail;
    }
}

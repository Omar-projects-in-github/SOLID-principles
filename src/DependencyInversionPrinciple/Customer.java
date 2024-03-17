package DependencyInversionPrinciple;

public class Customer {

    private String name;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package decorator;

public class GreeterImpl implements Greeter {




    @Override
    public String greet(String firstName, String lastName) {
        return String.format("Labas, %s %s", firstName, lastName);
    }
}

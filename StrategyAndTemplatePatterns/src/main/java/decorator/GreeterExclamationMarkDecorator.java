package decorator;

public class GreeterExclamationMarkDecorator implements Greeter{

    Greeter original;
    public GreeterExclamationMarkDecorator(Greeter original){
        this.original = original;
    }

    @Override
    public String greet(String firstName, String lastName) {
        return original + "!";
    }
}

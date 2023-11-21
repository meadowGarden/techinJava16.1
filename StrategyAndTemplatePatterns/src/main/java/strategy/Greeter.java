package strategy;

public class Greeter {

    private GreeterLanguageStrategy greeterLanguageStrategy;

    public String greet(String firstName, String lastName) {
        return greeterLanguageStrategy.getGreetingString() + firstName + " " + lastName;
    }

    public void setGreeterLanguageStrategy(GreeterLanguageStrategy gls) {
        greeterLanguageStrategy = gls;
    }

}

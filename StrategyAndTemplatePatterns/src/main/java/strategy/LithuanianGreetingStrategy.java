package strategy;

public class LithuanianGreetingStrategy implements GreeterLanguageStrategy {

    @Override
    public String getGreetingString() {
        return "labas, ";
    }
}

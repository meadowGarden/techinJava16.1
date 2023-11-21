package strategy;

public class Main {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        greeter.setGreeterLanguageStrategy(new LithuanianGreetingStrategy());
        System.out.println(greeter.greet("sigita", "gedaitė"));
        greeter.setGreeterLanguageStrategy(new EnglishGreetingStrategy());
        System.out.println(greeter.greet("jane", "doe"));

    }
}

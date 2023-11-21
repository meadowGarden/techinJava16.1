package decorator;

public class Main {
    public static void main(String[] args) {
        GreeterImpl greeterSimple = new GreeterImpl();
        System.out.println(greeterSimple.greet("sigita", "geda"));
        GreeterExclamationMarkDecorator greeterWithExclamation = new GreeterExclamationMarkDecorator(greeterSimple);
        System.out.println(greeterWithExclamation.greet("sigita", "geda"));
        GreeterUpperCaseDecorator greeterUpper = new GreeterUpperCaseDecorator(greeterSimple);
        System.out.println(greeterUpper.greet("sigita", "geda"));
    }
}

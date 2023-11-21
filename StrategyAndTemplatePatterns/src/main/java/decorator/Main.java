package decorator;

public class Main {
    public static void main(String[] args) {

        GreeterImpl greeterSimple = new GreeterImpl();
        System.out.println(greeterSimple.greet("sigita", "geda"));
        GreeterExclamationMarkDecorator greeterWithExclamation = new GreeterExclamationMarkDecorator();


    }
}

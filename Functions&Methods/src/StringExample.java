import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        // String message = greeting();
        String welcome = personnalisedGreeting("sara");
        // System.out.println(message);
        System.out.println(welcome);
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

    }

    static String personnalisedGreeting(String name) {
        String greet = "Hello " + name;
        return greet;
    }

    // static String greeting() {
    // String greet = "Hello everyone!";
    // return greet;
    // }
}

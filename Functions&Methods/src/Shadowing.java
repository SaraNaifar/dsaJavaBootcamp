public class Shadowing {
    static int number = 99;

    public static void main(String[] args) {
        System.out.println(number);
        int number;
        number = 1;
        System.out.println(number);
    }
}

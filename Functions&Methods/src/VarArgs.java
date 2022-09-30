import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("sara", 1, 2, 3, 5, 9, 8);
    }

    static void fun(String name, int... numbers) {
        System.out.println(name + Arrays.toString(numbers));
    }
}

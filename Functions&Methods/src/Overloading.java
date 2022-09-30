import java.util.Arrays;

import javax.print.attribute.SupportedValuesAttribute;

public class Overloading {
    public static void main(String[] args) {
        overloadingTest(5, 7);
        overloadingTest(5);

    }

    static void overloadingTest(int... a) {
        System.out.println(Arrays.toString(a));
    }

    static void overloadingTest(int a) {
        System.out.println(a);
    }
}

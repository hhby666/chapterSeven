package stackTrace;

import java.util.*;

/**
 * @author by wlq on 2020/11/8
 * @version Java1.9 IDEA2020.2
 */
public class StackTrace {
    public static int factorial(int n) {
        System.out.println("factorial(" + n + ")");
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n <= 1) {
            r = 1;
        } else {
            r = factorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }
}

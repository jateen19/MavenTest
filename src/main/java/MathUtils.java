public class MathUtils {
    public static int add (int a, int b) {

        return a+b;
    }

    public static int subtract (int a, int b) {

        return a-b;
    }

    public static int multiply (int a, int b) {

        return a*b;
    }

    public static double divide (double a, double b) {
        if (b != 0) {
            return a/b;
        } else {
            return -1;
        }
    }
}

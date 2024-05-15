public class NewtonSqrt {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(sqrt(num));
    }

    static double sqrt(int n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.001) {
                break;
            }
            x = root;
        }
        return root;
    }
}

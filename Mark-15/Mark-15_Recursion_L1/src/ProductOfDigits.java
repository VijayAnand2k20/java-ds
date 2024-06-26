public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(12034));
    }

    static int product(int num) {
        if (num%10 == num) {
            return num;
        }
        return (num%10) * product(num/10);
    }
}

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1243));
    }

    static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num%10 + sumDigits(num/10);
    }
}

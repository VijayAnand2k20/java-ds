public class Reverse {

    static int sum = 0;

    static void rev1(int num) {
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        rev1(num / 10);
    }

    static int rev2(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }
        int rem = num % 10;
        return (rem * ((int) Math.pow(10, digits - 1)) + helper(num / 10, digits - 1));
    }

    public static void main(String[] args) {
        // rev1(1243);
        // System.out.println(sum);
        System.out.println(rev2(12345));
    }
}

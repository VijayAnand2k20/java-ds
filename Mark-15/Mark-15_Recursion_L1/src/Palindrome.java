public class Palindrome {

    static int reverse(int num) {
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

    static boolean palindrome(int num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {
        System.out.println(palindrome(442244));
    }

}

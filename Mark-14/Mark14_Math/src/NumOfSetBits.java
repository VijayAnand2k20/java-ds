public class NumOfSetBits {
    public static void main(String[] args) {
        int n = 234567;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            // n -= (n & -n);
            n = (n & (n-1));
            count++;
        }
        return count;
    }
}

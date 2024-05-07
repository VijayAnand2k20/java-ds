public class Power {
    public static void main(String[] args) {
        System.out.println(pow(3, 6));
    }

    public static long pow(int a, int b) {
        long ans=1, base=a, power = b;
        while (power > 0) {
            if ((power&1) != 0) {
                ans = ans*base;
            }
            power >>= 1;
            base = base * base;
        }

        return ans;
    }
}

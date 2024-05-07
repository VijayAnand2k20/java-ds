public class MagicNum {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0, base=5;
        while(n > 0) {
            int digit = n & 1;
            ans += (digit * base);
            base *= 5;
            n >>= 1;
        }
        System.out.println(ans);
    }
}

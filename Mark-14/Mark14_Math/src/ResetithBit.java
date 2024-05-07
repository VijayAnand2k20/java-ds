public class ResetithBit {
    public static void main(String[] args) {
        int num = 17; // 10001
        int bit = 2;
        num &= ~(1 << (bit-1));
        System.out.println(num);
    }
}

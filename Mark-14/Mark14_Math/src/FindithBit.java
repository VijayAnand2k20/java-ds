public class FindithBit {
    public static void main(String[] args) {
        int num = 18;
        // 17 --> 1111, 10000, 10001, 10010
        int bit = 2;
        System.out.println((num & (1 << (bit-1))) != 0);
    }
}

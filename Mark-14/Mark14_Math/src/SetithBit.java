public class SetithBit {
    public static void main(String[] args) {
        int num = 17; // 10001
        int bit = 3;
        num |= (1<<(bit-1));
        System.out.println(num);
    }
}

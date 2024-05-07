public class NumOfDigits {
    public static void main(String[] args) {
        int num = 10;
        int b = 2;

        int ans = (int)(Math.log(num) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}

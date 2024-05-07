public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 4;
        // 256 in binary is 100000000
        // int op = (int)(Math.log(num) / Math.log(2));
        // // This gives me op=9.  
        // op = 1 << op;
        // // This gives me op=512 -> 1000000000

        // op = ~op;

        // if((num&op) == 0) {
        //     System.out.println("Power of 2");
        // }
        // else {
        //     System.out.println("Not a power of 2");
        // }

        // Optimal way:
        if (num == 0) {
            System.out.println("Zero is invalid.");
        }
        if((num & (num-1)) == 0) {
            System.out.println("Power of 2");
        }
        else {
            System.out.println("Not a power of 2");
        }
    }
}

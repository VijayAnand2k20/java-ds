import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt(), count = 0;
        System.out.print("Enter the digit to count: ");
        int check = in.nextInt();

        // math method
        int temp = num;
        while(temp!=0) {
            int rem = temp%10;
            if (rem == check) {
                count++;
            }
            temp/=10;
        }
        System.out.println("The number of times the digit '" + check + "' appeared is: " + count);
    }
}

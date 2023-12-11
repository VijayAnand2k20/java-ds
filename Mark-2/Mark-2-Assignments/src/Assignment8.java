import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number of range: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the ending number of range: ");
        int num2 = sc.nextInt();
        while (num1 <= num2) {
            int sum = 0;
            int temp = num1;
            while(temp!=0) {
                int digit = temp%10;
                sum += (digit * digit * digit);
                temp/=10;
            }
            if (sum == num1) {
                System.out.println("The number " + num1 + " is an armstrong number");
            }
            num1++;
        }
    }
}

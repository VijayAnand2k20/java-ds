import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(isArmstrong(num)) {
            System.out.println("The entered number is an armstrong number");
        }
        else {
            System.out.println("The entered number is not an armstrong number");
        }
    }
    static boolean isArmstrong(int num) {
        int temp=num;
        int sum=0;
        while (num!=0) {
            int digit = num%10;
            sum += (Math.pow(digit, 3));
            num /= 10;
        }
        return sum == temp;
    }
}

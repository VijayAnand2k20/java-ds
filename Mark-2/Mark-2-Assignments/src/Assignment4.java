import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the greater than " + num2);
        }
        else {
            System.out.println(num2 + " is the greater than " + num1);
        }
    }   
}

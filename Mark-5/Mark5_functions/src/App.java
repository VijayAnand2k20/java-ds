import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Q. Input 2 numbers and print the sum
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("The sum is " + (num1+num2));
    }
}

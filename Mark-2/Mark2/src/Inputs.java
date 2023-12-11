import java.util.Scanner;

/**
 * Inputs
 */
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Integer
        // System.out.print("Please enter your roll number: ");
        // int rollno = input.nextInt();
        // System.out.println("Your roll number is " + rollno);

        // String
        // System.out.print("Enter your name: ");
        // String name = input.next();
        // System.out.println("Welcome back " + name + "!");

        // Float
        System.out.print("Enter the digits of pi: ");
        float pi = input.nextFloat();
        System.out.println("Pi is equal to " + pi);
    }
}
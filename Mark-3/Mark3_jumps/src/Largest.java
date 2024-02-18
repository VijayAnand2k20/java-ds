import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        // Find the largest of 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers seperated by a space: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Traditional approach
        if(num1>num2 && num1>num3) {
            System.out.println(num1 + " is the largest!");
        }
        else if(num2>num1 && num2>num3) {
            System.out.println(num2 + " is the largest!");
        }
        else {
            System.out.println(num3 + " is the largest! ");
        }

        // Different approach 1:
        int max = num1;
        if(num2>max) {
            max = num2;
        }
        if(num3>max) {
            max = num3;
        }
        System.out.println(max + " is the largest!");

        // Different approach 2:
        int Max = Math.max((Math.max(num1, num2)), num3);
        
        System.out.println(max + " is the largest!");
    }
}

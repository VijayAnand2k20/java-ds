import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op =='/' || op == '%') {
                int ans=0;
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt(), num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Invalid operands");
                    }
                }
                if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    }
                    else {
                        System.out.println("Invalid operands");
                    }
                }
                if (ans!=0) {
                    System.out.println("Result: " + ans);
                }
            }
            else if (op == 'x' || op == 'X') {
                System.out.println("Exited!");
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
        }
    }
}

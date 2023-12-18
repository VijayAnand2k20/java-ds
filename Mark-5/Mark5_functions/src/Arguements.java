import java.util.Scanner;

public class Arguements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        sc.close();
        int ans = add(num1, num2);
        System.out.println("The sum is " + ans);
    }
    static int add(int a, int b) {
        return a+b;
    }
}

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        float num1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        float num2 = input.nextInt();
        float sum = num1 + num2;
        System.out.println("Sum = " + sum);

    }
}

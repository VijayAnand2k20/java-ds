import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        float conversion = 0.012f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price in INR: ");
        float amount = sc.nextFloat();
        System.out.println(amount+" in USD: "+(amount*conversion));
    }
}
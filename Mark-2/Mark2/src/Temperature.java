import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in degree celcius:");
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        float ans = (temp*1.8f) + 32;
        System.out.println("The temperature in farenheit is: " + ans);
    }
}

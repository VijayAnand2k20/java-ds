import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        if(isPrime(num)) {
            System.out.println("The given number is a prime number!");
        }
        else {
            System.out.println("The given number is not a prime number!");
        }

    }

    static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for(int i=2; i*i <= num ; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}

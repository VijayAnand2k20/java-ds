import java.util.Scanner;

public class Combinatorics {
    
    public static int factorial(int num) {
        int ans=1;
        for (int i = 1; i <= num; i++) {
            ans*=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of n and r: ");
        int n=in.nextInt(), r=in.nextInt();
        float ncr = factorial(n)/(factorial(r)*(factorial(n-r)));
        System.out.println(n+"C"+r+" = " + ncr);
    }
}

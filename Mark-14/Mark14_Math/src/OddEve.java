import java.util.Scanner;

public class OddEve {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();
        if ((a & 1) == 1) {
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}

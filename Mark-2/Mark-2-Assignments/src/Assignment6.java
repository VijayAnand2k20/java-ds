import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int num = sc.nextInt();
        int sum = 0, a=1, b=-1;
        for(int i=0; i<num ; i++) {
            sum = a + b;
            b =a;
            a = sum;
            System.out.print(sum + " ");
        }
    }
}

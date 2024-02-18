import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int a=0, b=1, count=2;
        while(count <= num) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}

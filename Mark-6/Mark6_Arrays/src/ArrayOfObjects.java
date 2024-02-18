import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        String[] str = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        sc.close();
        System.out.println(Arrays.toString(str));
    }
}

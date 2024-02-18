import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // Array of primitives

        // arr[0] = 23;
        // arr[1] = 24;
        // arr[2] = 25;
        // arr[3] = 26;
        // arr[4] = 27;
        // {23,24,25,26,27}
        // System.out.println(arr[3]);

        // Input using for loop
        for(int i=0; i<arr.length ; i++) {
            System.out.print("Enter number " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        sc.close();
        // for(int i=0; i<arr.length ; i++) {
        //     System.out.println(arr[i]);
        // }

        // Enhanced for loop
        for(int num: arr) {
            System.out.println(num);
        }

        System.out.println(Arrays.toString(arr));
    }
}

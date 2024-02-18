import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][];
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // int[][] arr2d = {
        //     {1,2,3,4},
        //     {4,5},
        //     {6,7,8,9,0}
        // };
        // System.out.println(Arrays.toString(arr2d));
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int[3][3];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

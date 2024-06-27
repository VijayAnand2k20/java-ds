import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int rows, int cols) {
        if(rows == 0) {
            return;
        }
        if (rows != cols ) {
            if (arr[cols] > arr[cols + 1]) {
                int temp = arr[cols];
                arr[cols] = arr[cols+1];
                arr[cols+1] = temp;
            }
            sort(arr, rows, cols+1);
        }
        else {
            sort(arr, rows-1, 0);
        }
    }
}

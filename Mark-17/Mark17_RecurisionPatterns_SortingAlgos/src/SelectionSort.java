import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 8, 1};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int rows, int cols, int max) {
        if (rows == 0) {
            return;
        }
        if (rows > cols) {
            // max = arr[cols] > max ? arr[cols] : max;
            if(arr[cols] > arr[max]) {
                sort(arr, rows, cols+1, cols);
            }
            else {
                sort(arr, rows, cols+1, max);
            }
        }
        else {
            int temp = arr[rows-1];
            arr[rows-1] = arr[max];
            arr[max] = temp;
            sort(arr, rows-1, 0, 0);
        }
    }
}

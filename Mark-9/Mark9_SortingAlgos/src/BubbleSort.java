import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)  {
        // int[] arr = { 5,4,3,2,1 };
        // int[] arr = { 1,2,3,4,5 };
        int[] arr = {};


        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // Run the steps n-1 times;
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // For each step, maximum will get to that last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if item is smaller than previous item
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            // If swap didn't even happen for an `i`, it must be already sorted. So break out
            if (!swapped) {
                break;
            }
        }
    }
}

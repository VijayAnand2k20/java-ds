import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // int[] arr = {4, 5, 1, 2, 3};
        int[] arr = { 5, 4, 3, 2, 1 };
        // int[] arr = {4};
        // int[] arr = {};
        // int[] arr = { 2,1 };

        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum item in the remaining array and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    
}

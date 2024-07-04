import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high) {
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;

        int mid = start + (end-start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }
            
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // Pivot is at correct index
        quickSort(nums, low, end);
        quickSort(nums, start, high);

    }
}

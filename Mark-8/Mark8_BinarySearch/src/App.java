public class App {
    public static void main(String[] args) {
        int[] nums = {1,3,6,7,8,10,12,86};
        System.out.println(binary_search(nums, 200 ));
    }

    static int binary_search(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while (start <= end) {
            // int mid = (start+end)/2; // might be possible that (start+end) can exceed range of int in Java
            int mid = start + (end-start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}

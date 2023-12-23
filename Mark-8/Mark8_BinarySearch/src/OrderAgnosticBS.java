public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] nums = {100,20,9,8,7,6,2,-12};
        int[] nums = {1,3,6,7,8,10,12,86};

        System.out.println(order_ag_binary_search(nums, 3));
    }
    static int order_ag_binary_search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        // find whether array is in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start+end)/2; // might be possible that (start+end) can exceed range of int in Java
            int mid = start + (end-start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    } 
}

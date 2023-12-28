public class PositionInfiniteArr {

    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 
            140, 160, 170};
        int target = 100;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // // find the range first
        // int start=0, end=1;
        
        // // condition for the target to lie in the range: target must be less than end. So we'll double the size of windows when the target is greater than end
        // while (target > arr[end]) {
        //     int temp = end + 1;
        //     // double the box
        //     // end = prev_end + [sizeof(box) * 2]
        //     end = end + (end - start + 1) * 2; // size of the box = end - (start - 1) => end - start + 1
        //     start = temp;
        // }

        // return binary_search(arr, target, start, end);

        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binary_search(arr, target, start, end);
 
    }

    public static int binary_search(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;

    }
}

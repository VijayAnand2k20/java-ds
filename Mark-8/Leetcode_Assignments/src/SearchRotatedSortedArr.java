public class SearchRotatedSortedArr {

    // https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    // Google + Amazon question

    /*
     * Two Approaches available
     * 
     * 1. Finding the pivot in the array(Pivot => where the change occurs, here it
     * is the largest number)
     * 
     * 
     */

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 4));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // If we don't find pivot, it means the array is not rotated
        if (pivot == -1) {
            // Normal binary search
            return binary_search(arr, target, 0, arr.length - 1);
        }

        // If pivot is found, we found 2 sorted array!
        // Case 1: If target == pivot
        if (arr[pivot] == target) {
            return pivot;
        }

        // Case 2: target element>start element -> Search from start till pivot-1
        if (target >= arr[0]) {
            return binary_search(arr, target, 0, pivot - 1);
        }
        
        // Case 3: Otherwise, check the other half of the array
        return binary_search(arr, target, pivot + 1, arr.length - 1);
    }

    static int binary_search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start) + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Won't work for arrays with duplicate elements
    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 Cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 Cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            
            // If elements at start == mid == start, Then ignore the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Ignore the duplicates

                // NOTE: What if these elements at start and end were the pivots?
                
                // Check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                
                // Check if end is pivot or not
                if (arr[end-1] > arr[end]) {
                    return end-1;
                }
                end--;
            }
            
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

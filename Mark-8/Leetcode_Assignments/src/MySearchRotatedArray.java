public class MySearchRotatedArray {
    public static void main(String[] args) {
        int[] array = { 112, 223, 234, 45, 56, 67, 78, 98 };
        System.out.println(search(array, 223));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        if (pivot == -1) {
            return binary_search(arr, target, 0, arr.length - 1);
        }

        if (target == arr[pivot]) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binary_search(arr, target, 0, pivot - 1);
        }
        return binary_search(arr, target, pivot + 1, arr.length - 1);
    }

    static int binary_search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] > arr[mid - 1]) {
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
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 1:
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 18, 100 };
        System.out.println(search(arr, 18, 0, arr.length)); // continue from 1:42:45
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        }

        return search(arr, target, mid + 1, end);
    }
}

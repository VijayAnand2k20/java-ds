public class App {
    public static void main(String[] args) {
        int[] nums = {12,245,23,57,879,345,25,896};
        int target = 25;
        int ans = linear_search(nums, target);
        if (ans!=-1) {
            System.out.println("Element is found at index " + ans);
        }
        else {
            System.out.println("Element is not present in the array.");
        }
    }

    // search in array:
    static int linear_search(int[] arr, int element) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

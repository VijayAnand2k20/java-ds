public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,16,27,38,49,60};
        int ans = Floor(arr, 40);
        System.out.println(ans);
    }

    static int Floor(int[] arr, int target) {
        if (target < arr[0]) {
            return -1;
        }
        int start=1, end=10, mid=Integer.MIN_VALUE;
        while (start<=end) {
            mid = (start) + (end-start)/2;
            if(arr[mid] < target) {
                start=mid+1;
            }
            else if(arr[mid] == target) {
                return arr[mid];
            }
            else {
                end = mid-1;
            }
        }
        return arr[end];
    }
}

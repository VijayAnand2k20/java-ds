public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,16,27,38,49,60};
        int ans = Ceil(arr, 7);
        System.out.println(ans);
    }

    static int Ceil(int[] arr, int target) {
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start=0, end=arr.length-1, mid=Integer.MIN_VALUE;
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
        return arr[start];
    }
}

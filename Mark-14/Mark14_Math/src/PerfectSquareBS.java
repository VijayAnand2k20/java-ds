public class PerfectSquareBS {
    public static void main(String[] args) {
        int num = 100;
        int ans = sqrt(num);
        System.out.println(ans);
    }

    static int sqrt(int num) {
        int start = 0, end = num;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (mid*mid == num) {
                return mid;
            }
            if(mid*mid > num) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    // static int mySqrt(int x) {
    //     int num = 1;
    //     while(num*num < x) {
    //         num++;
    //     }
    //     return num-1;
    // }

    static int mySqrt(int x) {
        if (x==0 || x==1) {
            return x;
        }
        int start=1, end=x, mid=Integer.MIN_VALUE;
        while (start<=end) {
            mid = (start) + (end-start)/2;
            if((long)x > (long) mid*mid) {
                start=mid+1;
            }
            else if((long)x == (long)mid*mid) {
                return mid;
            }
            else {
                end = mid-1;
            }
        }
        return end;
    }
}

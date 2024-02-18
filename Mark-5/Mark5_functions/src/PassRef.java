import java.util.Arrays;

public class PassRef {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,8,7};
        change(arr);
        // System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 100;
    }
}

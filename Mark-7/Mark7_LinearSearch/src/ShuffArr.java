import java.util.Arrays;

/**
 * ShuffArr
 */
public class ShuffArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = shuffle(arr, 3);

        System.out.println(Arrays.toString(ans));

    }

    static public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i=0,j=n, k=0;
        while(j<(2*n)) {
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            i++;
            j++;
            k+=2;
        }
        return ans;
    }
}
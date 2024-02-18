import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i=0, j=(arr.length) - 1;
        System.out.println(Arrays.toString(arr));
        while (i<j) {
            SwapEl.swap(arr, i, j);
            i++;
            j--;
            // System.out.println(i + "-" + j);
        }
        System.out.println(Arrays.toString(arr));

    }

}

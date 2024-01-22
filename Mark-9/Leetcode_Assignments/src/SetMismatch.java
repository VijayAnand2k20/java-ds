// Problem: https://leetcode.com/problems/set-mismatch/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] nums) {
        int[] ans = {-1,-1};
        int i=0;
        while (i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            }
            else {
                i++;
                continue;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans[0] = nums[index];
                ans[1] = index+1;
                return ans;
            }
        }

        return ans;
    }

    static void swap(int[] arr, int wrongIndex, int correctIndex) {
        int temp = arr[wrongIndex];
        arr[wrongIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}

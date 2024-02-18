// Leetcode 268: https://leetcode.com/problems/missing-number/description/

// Amazon Question

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] =  {3, 5, 2, 1, 0 };
        sort(arr);
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        sort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    static void sort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i];
            if ((correct == i) || (arr[i] == arr.length)) {
                i++;
                continue;
            }
            swap(arr, i, correct);
        }
    }

    static void swap(int[] arr, int wrongIndex, int correctIndex) {
        int temp = arr[wrongIndex];
        arr[wrongIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}

// Problem: https://leetcode.com/problems/first-missing-positive/description/

// Amazon Interview Question

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        sort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return index+1;
            }
        }
        return nums.length+1;
    }

    static void sort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i]-1;
            if ((arr[i] < 0) || (arr[correct] == arr[i]) || (arr[i] >= arr.length)) {
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

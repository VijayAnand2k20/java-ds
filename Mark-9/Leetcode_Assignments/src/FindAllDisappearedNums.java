// Problem: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

// Google Interview question

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedNums {
    public static void main(String[] args) {
        int arr[] =  {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void sort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
                continue;
            }
        }
    }

    static void swap(int[] arr, int wrongIndex, int correctIndex) {
        int temp = arr[wrongIndex];
        arr[wrongIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}

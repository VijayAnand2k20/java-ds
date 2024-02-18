// Leetcode 1295: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

// Given an array nums of integers, return how many of them contain an even number of digits.

public class EvenDigits {
    public static void main(String[] args) {
        // int[] arr = {12,345,2,6,7896};
        int[] arr = {555,901,482,1771};

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count=0;
        for (int num : nums) {
            if(even2(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int count=0;
        while (num!=0) {
            count++;
            num /= 10;
        }
        if (count%2==0) {
            return true;
        }
        return false;
    }

    static boolean even2(int num) {
        int count = (int)(Math.log10(num)) - 1;
        return (count%2==0); 
    }
}

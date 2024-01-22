// Problem: https://leetcode.com/problems/find-the-duplicate-number/description/

// Amazon interview question + Also asked in Microsoft

public class FindDup {
    public static void main(String[] args) {
    //  int[] arr = {1,3,4,2,2};
     int[] arr = {3,1,1,4,2};
     System.out.println(findDuplicate(arr));   
    }

    static public int findDuplicate(int[] nums) {
        int[] temp = nums;

        int i=0;
        while (i<temp.length) {
            int correct = temp[i] - 1;
            if (temp[i] != i+1) {
                if (temp[i] != temp[correct]) {
                    swap(temp, i, correct);
                }
                else {
                    return temp[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;

    }

    static void swap(int[] arr, int wrongIndex, int correctIndex) {
        int temp = arr[wrongIndex];
        arr[wrongIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}

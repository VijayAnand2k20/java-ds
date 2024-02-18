import java.util.Arrays;

public class ArrTwoDimBS {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {11, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        // int[][] arr = {{1}};
        
        // int[][] arr = {
        //     {1, 3, 5, 7},
        //     {10, 11, 16, 20},
        //     {23, 30, 34, 60}
        // };
        System.out.println(Arrays.toString(search(arr, 39)));
    }

    // static String binarySearch(int[][] nums, int target) {
    //     for (int row = 0; row < nums.length; ) {
    //         // System.out.println(nums[row][nums[row].length -1]);
    //         // System.out.println(nums[row].length - 1);
    //         // int col=
    //         // while (col>=0) {
                
    //         // }
    //         // System.out.println("Row: " + row);
    //         for (int col = nums[row].length - 1; col >= 0; ) {
    //             // System.out.println("Col: " + col);
    //             if (target < nums[row][col]) {
    //                 col--;
    //             }
    //             else if (target > nums[row][col]) {
    //                 row++;
    //             }
    //             else {
    //                 return Arrays.toString(new int[] {row, col});
    //             }
    //         }
    //     }
    //     return "-1";
    // }

    static int[] search(int[][] arr, int target) {
        int row = 0, col = arr[0].length - 1;
        while(row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] {row,col};
            }
            else if(arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}

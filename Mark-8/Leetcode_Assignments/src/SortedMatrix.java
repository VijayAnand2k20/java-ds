import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,1)));
    }

    // Search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int target, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, target, 0, 0, cols);
        }

        int rowStart = 0, rowEnd = rows - 1;

        int midCol = cols / 2;

        // run the loop till two rows are remaining
        while (rowStart < (rowEnd - 1)) { // While this is true, it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][midCol] == target) {
                return new int[] { mid, midCol };
            }
            if (matrix[mid][midCol] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // Now, we have two rows

        // Check whether target is in the col of 2 rows
        if (matrix[rowStart][midCol] == target) {
            return new int[] { rowStart, midCol };
        }
        if (matrix[rowStart + 1][midCol] == target) {
            return new int[] { rowStart + 1, midCol };
        }

        // Search in 1st half

        if (target <= matrix[rowStart][midCol - 1]) {
            return binarySearch(matrix, target, rowStart, 0, midCol - 1);
        }

        // Search in 2nd half

        if ((target >= matrix[rowStart][midCol + 1]) && (target <= matrix[rowStart][cols - 1])) {
            return binarySearch(matrix, target, rowStart, midCol + 1, cols - 1);
        }

        // Search in 3rd half

        if (target <= matrix[rowStart + 1][midCol - 1]) {
            return binarySearch(matrix, target, rowStart + 1, 0, midCol - 1);
        }

        // Search in 4th half
        else {
            return binarySearch(matrix, target, rowStart + 1, rowStart + 1, cols - 1);
        }

    }
}

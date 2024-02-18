public class App {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int N) {
        N = 2 * N;
        for (int row = 0; row <= N; row++) {
            for (int col = 0; col <= N; col++) {
                int left = col;
                int top = row;
                int right = N - col;
                int bottom = N - row;
                int atEveryIndex = Math.min(top, bottom);
                atEveryIndex = Math.min(atEveryIndex, left);
                atEveryIndex = Math.min(atEveryIndex, right);
                System.out.print((N/2)-atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? (2 * n - row) : row;
            for (int spaces = 0; spaces < n - totalColsInRow; spaces++) {
                System.out.print("  ");
            }
            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? (2 * n - row) : row;
            int nOfSpaces = n - totalColsInRow;
            for (int s = 0; s < nOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            /*
             * 
             * After Crossing 'n', we need to delete `row`-`n` characters from the print
             * 
             * We have to delete it from `n` as `n` is the longest possible.
             * 
             * SO, it is `n` - (`row - n`) => 2*n - row
             * 
             * For instance, consider row 5(0 based indexing),
             * Also, consider inner loop run from 0 on `<` and not `<=`
             * 
             * we need to delete 1 character from it.
             * 
             * `row`-`n` = 5-5 = 0
             * 
             * `2*n - row` = 2*5 - 5 = 10-5 = 5
             * 
             * The loop will run until 4 which is the required amount.
             * 
             * Now, consider row 7th, we need to print only 2 stars, so we must get 3
             * 
             * 2*n - row = 2*5 - 7 = 10-7 = 3 // TADAAA!
             * 
             */
            int totalColsInRow = row > n ? (2 * n - row) : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class TrianglePattern {
    public static void main(String[] args) {
        // printLeftTopTriangle(4, 0);
        printBottomLeftTriangle(4, 0);
    }

    static void printBottomLeftTriangle(int rows, int cols) {
        if(rows == 0) {
            return;
        }
        if (rows != cols ) {
            printBottomLeftTriangle(rows, cols+1);
            System.out.print("* ");
        }
        else {
            printBottomLeftTriangle(rows-1, 0);
            System.out.println();
        }
    }

    static void printLeftTopTriangle(int rows, int cols) {
        if(rows == 0) {
            return;
        }
        if (rows != cols ) {
            System.out.print("* ");
            printLeftTopTriangle(rows, cols+1);
        }
        else {
            System.out.println();
            printLeftTopTriangle(rows-1, 0);
        }
    }
}

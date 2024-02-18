import java.util.Scanner;

public class DistPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first coordinates x1 and y1: ");
        int x1=in.nextInt(),y1=in.nextInt();
        System.out.print("Enter the second coordinates x2 and y2: ");
        int x2=in.nextInt(),y2=in.nextInt();
        float ans = (float) Math.sqrt(
            (Math.pow(x1-x2, 2)) + (Math.pow(y2-y1, 2))
        );
        System.out.println("The distance between the points is: " + ans + " units");
    }
}

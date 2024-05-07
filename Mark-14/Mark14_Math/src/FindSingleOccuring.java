import java.util.ArrayList;
import java.util.Scanner;

public class FindSingleOccuring {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(9);
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i < 9 ; i++) {
            arr.add(in.nextInt());
        }
        in.close();
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            ans = ans ^ arr.get(i);
        }
        System.out.println(ans + " is the only element that has no duplicates.");
    }
}

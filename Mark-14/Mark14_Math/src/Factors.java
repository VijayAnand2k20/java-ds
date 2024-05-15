import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(20);
    }

    // Time Complexity: O(N)
    static void factors1(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Time Complexity: O(sqrt(N))
    static void factors2(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }

    // Time Complexity & Space Complexity: O(sqrt(N))
    // Printing in sorted order
    static void factors3(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(num / i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        System.out.println(list);
        // System.out.println(list.contains(20));
        // list.set(0, 100);
        // list.remove(3);
        // System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        // System.out.println(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}

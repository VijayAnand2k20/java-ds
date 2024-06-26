import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 3};
        // System.out.println(search(arr, 18, 0));

        // findAll(arr, 3, 0);
        // System.out.println(indexes.toString());

        // System.out.println(findAll2(arr, 1, 0, new ArrayList<>()));
        
        System.out.println(findAllWithoutArgs(arr, 3, 0));

    }

    static int search(int[] arr, int target, int index) {
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index+1);
    }

    // static ArrayList<Integer> indexes = new ArrayList<>();

    // static void findAll(int[] arr, int target, int index) {
    //     if (arr.length == index) {
    //         return;
    //     }
    //     if (arr[index] == target) {
    //         indexes.add(index);
    //     }
    //     findAll(arr, target, index+1);
    // }

    static ArrayList<Integer> findAll2(int[] arr, int target, int index, ArrayList<Integer> indexes) {
        if (arr.length == index) {
            return indexes;
        }
        if (arr[index] == target) {
            indexes.add(index);
        }
        return findAll2(arr, target, index+1, indexes);
    }

    static ArrayList<Integer> findAllWithoutArgs(int[] arr, int target, int index) {
        ArrayList<Integer> indexes = new ArrayList<>();
        if (arr.length == index) {
            return indexes;
        }
        if (arr[index] == target) {
            indexes.add(index);
        }
        ArrayList<Integer> BelowAnswers = findAllWithoutArgs(arr, target, index+1);
        if (BelowAnswers.size() != 0) {
            indexes.addAll(BelowAnswers);
        }
        return indexes;
    }
}

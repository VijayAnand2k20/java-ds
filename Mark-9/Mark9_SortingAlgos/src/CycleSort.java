import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // int arr[] =  {3, 5, 2, 1, 4 };
        // int arr[] = {1};
        int arr[] = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (correct == i) {
                i++;
                continue;
            }
            swap(arr, i, correct);
        }
    }


    // { 5, 4, 2, 3, 1 }
    static void swap(int[] arr, int wrongIndex, int correctIndex) {
        int temp = arr[wrongIndex];
        arr[wrongIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}

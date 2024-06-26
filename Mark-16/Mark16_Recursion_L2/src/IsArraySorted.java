public class IsArraySorted {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 5, 9, 8};
        System.out.println(arraySorted(arr, 0));
    }
    static boolean arraySorted(int[] array, int index) {
        if (array.length - 1 == index) {
            return true;
        }
        return (array[index] < array[index+1] && arraySorted(array, index+1));
    }
}

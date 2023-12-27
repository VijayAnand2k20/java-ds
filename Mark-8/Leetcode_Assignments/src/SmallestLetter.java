public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        if (target > letters[letters.length-1]) {
            return letters[0];
        }
        int start=0, end=letters.length - 1, mid=Integer.MIN_VALUE;
        while (start<=end) {
            mid = (start) + (end-start)/2;
            if(letters[mid] < target) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
            // if (target < letters[mid]) {
            //     end = mid - 1;
            // }
            // else {
            //     start = mid + 1;
            // }
        }
        return letters[start];
    }
}

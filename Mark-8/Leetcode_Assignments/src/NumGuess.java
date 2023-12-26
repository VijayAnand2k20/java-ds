public class NumGuess {
    public static void main(String[] args) {
        System.out.println(guessNumber(6));
    }

    static int guessNumber(int n) {
        int start=1, end=n, mid=Integer.MIN_VALUE;
        while (start<=end) {
            mid = (start) + (end-start)/2;
            int guess = guess(mid); // Saved extra memory
            if(guess == 1) {
                start=mid+1;
            }
            else if(guess == 0) {
                return mid;
            }
            else {
                end = mid-1;
            }
        }
        return end;
    }
}

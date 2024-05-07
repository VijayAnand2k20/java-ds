/*
 * Qn:
Consider, arr = [2, 2, 3, 2, 7, 7, 8, 7, 8, 8]. How do you find the number that is appearing only once?

Thought Process:

If a number is appearing three times, its set bit will also be appearing three times.
So, we can count the number of set bits at each position and take modulo by 3.
The remaining bits will be the number that is appearing only once.
 * 
 * 
 */

import java.util.ArrayList;

public class OnceAppearing {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // {2, 2, 3, 2, 7, 7, 8, 7, 8, 8}
        arr.add(2);
        arr.add(2);
        arr.add(10);
        arr.add(2);
        arr.add(7);
        arr.add(7);
        arr.add(8);
        arr.add(7);
        arr.add(8);
        arr.add(8);

        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if ((arr.get(j) & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }
        System.out.println(result);
        
    }
}

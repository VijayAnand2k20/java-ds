public class SplitArrayLargestSum {
    
    /* https://leetcode.com/problems/split-array-largest-sum/
     * 
     * 
     * 1. What is the minimum number of partions(m) we can make? 1
     * 
     * Answer in case 1 will be the sum of that single array
     * 
     * 
     * 2. What is the maximum number of partitions(m) we can make? N
     * 
     * Answer in case 2 will be the largest number in the array
     * 
     * 
     * So, maximum ans can be found from case 1 ( as we take the complete array )
     * and, minimum ans can be found from case 2 ( as we take only a single element array )
     * 
     * Minimum answer = max_value in array
     * 
     * Maximum answer = sum(array)
     * 
     */
    
    public static void main(String[] args) {
        
    }

    static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // At the end of loop this will have the maximum number in array
            end += nums[i];
        }

        // Binary search
        while (start<end) {
            // Try for the middle for potential ans
            int mid = start + (end-start) / 2;

            // Calculate how many pieces you can divide this in with `mid` as maximum sum
            int sum=0;
            int pieces = 1;
            for (int num : nums) {
                if (sum+num > mid) {
                    // Cannot add this number in this sub array. Make this in new array
                    
                    // Let's say you add this in a new sub array, then sum will be equal to num
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start  = mid + 1;   
            }

            else {
                end = mid;
            }
        }


        return start;
    }
}

public class FirstLastPos {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        // check for first occurence of target
        ans[0] = binary_search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = binary_search(nums, target, false);
        }
        return ans;
    }

    public int binary_search(int[] nums, int target, boolean is_start) {
        int ans=-1;
        int start=0, end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target<nums[mid]) {
                end = mid-1;
            }
            else if(target>nums[mid]) {
                start = mid+1;
            }
            else {
                ans = mid;
                if(is_start) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}

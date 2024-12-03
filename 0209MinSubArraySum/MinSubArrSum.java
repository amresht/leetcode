public class MinSubArrSum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int curSum = 0;

        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];
            // if the current sum target is met
            while (curSum >= target) {
                // if the length of subarray  is lesser than existing subarray
                if (right - left + 1 < minLen) {
                    // new minimum subarray length is found
                    minLen = right - left + 1;
                }
                // remove the first element from to move the array further as Left pointer moves ahead
                curSum -= nums[left];
                left++;
            }
        }
        
        return minLen != Integer.MAX_VALUE ? minLen : 0;        
    }

}

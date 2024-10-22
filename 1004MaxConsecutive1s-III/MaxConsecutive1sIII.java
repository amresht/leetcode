/*
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
                        -----------
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
 */

 class MaxConsecutive1sIII {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int i = 0, j = 0;
        int zeros = 0;
        while(j<nums.length) {
            while(zeros>k) {
                if(nums[i++] == 0) {
                    zeros--;
                }
            }
            if(nums[j] == 0) {
                zeros++;
            }
            if(zeros <= k) {
                maxLen = Math.max(maxLen, j-i+1);
            }
            j++;
        }
        return maxLen;

    }
}
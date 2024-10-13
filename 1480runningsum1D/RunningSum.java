/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

*/
class RunningSum {
	
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
		results[0] = nums[0];
		
		for (int i = 1 ; i< nums.length ; i++) {
			results[i] = nums[i]+ results[i-1];
		}
		return results;
	
	// time complexity = O(n)
	// space complexity = O(1)
    }    
	

	
	public int[] runningSumInPlace(int[] nums) {

		
		for (int i =0 ; i< nums.length ; i++) {
			nums[i]+= nums[i-1];
		}
		return nums;
    }
	
	// time complexity = O(n)
	// space complexity = O(1)
}
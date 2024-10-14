/*
PROBLEM STATEMENT: Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
 
*/ 
class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int sum =0;
        int maxSum =0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i]==1){
                sum+= 1;
                //maxSum = Math.max(maxSum, sum);
            }
            else {
                maxSum = Math.max(maxSum, sum);
                sum=0;
            }
        }
        maxSum = Math.max(maxSum, sum);
        return maxSum;

    }
}
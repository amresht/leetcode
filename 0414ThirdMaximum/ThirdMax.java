/*
 * Given an integer array nums, return the third distinct maximum number in this array. 
 * If the third maximum does not exist, return the maximum number.
 */

import java.util.Arrays;

class Solution {
    public static int thirdMax(int[] nums) {
        // sort the array
        Arrays.sort(nums);
        int len = nums.length ;
        int ctr =1;
        // iterate from largest to smallest
        for (int i=len-1; i > 0  ; i--) {
            // find distinct values
            if(nums[i] != nums[i-1]) {
                ctr++;
            }
            //if 3rd maximum is found return it
            if(ctr==3) {
                return nums[i-1];
            }
        }
        return nums[len-1];       
    }

    public static void main(String args[]) {
        int[] inputs = new int[]{31,2,14,5,6,7,11,20,56};
        int result = thirdMax(inputs);
        System.out.println(result);
        
        return;
    }
}

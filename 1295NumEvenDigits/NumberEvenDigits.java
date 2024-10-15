/*
*@author: amresht
LeetCode 1295: Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2

Example 2:
Input: nums = [555,901,482,1771]
Output: 1 

*/

public class NumberEvenDigits {
    public int findNumbers(int[] nums) {
        int ctr=0;
        // for each element in the array 
        for(int i=0; i< nums.length; i++){
            // convert to string 
            String temp = Integer.toString(nums[i]);
            // find if strlen % 2 ==0 
            if(temp.length() % 2 == 0){
                //if yes increment counter 
                ctr++;
            }
        }
        return ctr;
    }
   
}

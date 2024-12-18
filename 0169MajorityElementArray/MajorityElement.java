/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int len = nums.length;

        int result=nums[0];
        int majority =1;

        for (int i=1;i < len; i++){
            if(majority==0){
                result=nums[i];
            }

            if(nums[i]==result){
                majority++;
            }
            else{
                majority--;
            }
        }
        return result;
    }
}
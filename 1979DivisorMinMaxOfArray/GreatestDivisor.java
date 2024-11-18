/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
*/

import java.util.Arrays;

public class GreatestDivisor {
    public static int findGCD(int[] nums) {
        int gcd = 1;

        Arrays.sort(nums);

        for(int i=1; i<= nums[0]; i++) {
            if(nums[0]%i ==0 && nums[nums.length-1] % i ==0) {
                gcd=i;
            }
        }

        return gcd;

    }
}   


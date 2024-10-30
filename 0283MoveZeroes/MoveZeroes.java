/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 */

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }

        int left =0;
        
        
        for (int i= 0; i < len; i++) {

            if (nums[i] !=0 ) {
                int temp = nums[i];
                nums[i] =nums[left];
                nums[left] = temp;
                left++;
            }
        }
    } 

    public static void main(String args[]) {
        int[] inputs = new int[]{0,2,0,5,6,0,11};
        moveZeroes(inputs);
        for (int i= 0; i < inputs.length; i++)  {
            System.out.println(inputs[i]);
        }
        return;
    }
}

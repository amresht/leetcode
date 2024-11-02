/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition
 */
//#package 0905ParitySort;

public class ArrayParity {
    public static int[] sortArrayByParity(int[] nums) {
        int len = nums.length;

        int left=0;

        for(int i =0; i < len; i++){
            // if we find an even number
            if (nums[i]%2 ==0 ) {
                int temp = nums[i];         // Save the evem number in a temporary variable
                nums[i] =nums[left];        // Move it towards left(beginning) side of the array
                nums[left] = temp;          // 
                left++;
            }


        }
        return nums;
    }

public static void main(String args[]) {
        int[] inputs = new int[]{31,2,14,5,6,7,11,20,56};
        int[] result = sortArrayByParity(inputs);
        for (int i= 0; i < result.length; i++)  {
            System.out.println(result[i]);
        }
        return;
    }

}

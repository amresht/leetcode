/**
 * 
 */
//#package 0905ParitySort;

public class ArrayParity {
    public static int[] sortArrayByParity(int[] nums) {
        int len = nums.length;

        int left=0;

        for(int i =0; i < len; i++){
            if (nums[i]%2 ==0 ) {
                int temp = nums[i];
                nums[i] =nums[left];
                nums[left] = temp;
                left++;
            }


        }
        return nums;
    }

public static void main(String args[]) {
        int[] inputs = new int[]{31,2,14,5,6,7,11};
        int[] result = sortArrayByParity(inputs);
        for (int i= 0; i < result.length; i++)  {
            System.out.println(inputs[i]);
        }
        return;
    }

}

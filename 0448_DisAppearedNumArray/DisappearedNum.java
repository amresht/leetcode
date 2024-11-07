/* *
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array 
 * of all the integers in the range [1, n] that do not appear in nums.
*/

import java.util.ArrayList;
import java.util.List;

public class DisappearedNum {
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int len = nums.length;
        List<Integer>list= new ArrayList<>();
        boolean[] hasNum = new boolean[len];

        for(int i=0; i < len; i++) {
            hasNum[nums[i]-1] = true;
        }
        for(int j=0; j< len ; j++){
            if(!hasNum[j])  {
                list.add(j+1);
            }
        }

        return list;
    }
    

    public static void main(String args[]) {
        int[] inputs = new int[]{1,2,1,5,6,7,2,6,6};
        List<Integer>list = findDisappearedNumbers(inputs);
        System.out.println(list);
        return;
    }    
    
}

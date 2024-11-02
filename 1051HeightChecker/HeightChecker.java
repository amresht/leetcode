/*
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in 
 * non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the 
 * expected height of the ith student in line.You are given an integer array heights representing the current order that the 
 * students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
 * Return the number of indices where heights[i] != expected[i].
*/

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int count=0;
        int len = heights.length;
        //copy the original array
        int[] orig  = Arrays.copyOf(heights, len);

        Arrays.sort(heights);

        for(int i=0; i< len;i++) {
            if(heights[i]!=orig[i]) {
                count++;
            }

        }

        for (int i= 0; i < len; i++)  {
            System.out.println(orig[i]);
        }
        for (int i= 0; i < len; i++)  {
            System.out.println(heights[i]);
        }

        return count;
    }

    public static void main(String args[]) {
        int[] inputs = new int[]{1, 2, 5, 14, 6, 7, 11};
        int result = heightChecker(inputs);
        System.out.print("Mismatched: ");
        System.out.println(result);
        return;
    }
}

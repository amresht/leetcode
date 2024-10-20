/*
 * @author amresht 
 * @permlink 
 * #date 20-Oct-2024
 * @description 
 * 
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 * Given a string s, return the power of s.
 * Example 1: Input: s = "leetcode"
 *  * Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e' only.
 * 
 * Example 2:Input: s = "abbcccddddeeeeedcba"
 * Output: 5
 */
public class ConsecutiveChars {

    public static int maxPower(String s) {
        int maxResult =1;

        int[] powerArray = new int[s.length()];
        char m = s.charAt(0);
        powerArray[0] = 1;
        int result =1;
        for (int i=1; i< s.length(); i++) {
            if(m == s.charAt(i)) {
                result++;
                maxResult  =Math.max(maxResult, result);
            }
            else {
                m = s.charAt(i);
                result=1;
            }
        }
        return maxResult;
    }// end method
    
    
    public static void main() {
        String s= "abbcccddddeeeeedcba";
        
        int max  = maxPower(s);
        
        System.out.println(max);

    }
    
} //end class ConsecutiveChars


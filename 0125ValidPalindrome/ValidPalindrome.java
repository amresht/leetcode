/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric 
 * characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s= s.toLowerCase();

        int left =0;
        int right = s.length() -1;
        
        while (left <= right) {
            char currLeft = s.charAt(left);
            char currRight =  s.charAt(right);

            if(!Character.isLetterOrDigit(currLeft)) {
                left++;
            }
            else if(!Character.isLetterOrDigit(currRight)){
                right--;
            }
            else {
                if (currLeft != currRight) {  
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }



    public static void main(String args[]) {
        String input_string  = "A man, a plan, a canal: Panama" ;
        boolean result = isPalindrome(input_string);
        System.out.println(result);
        return;
    }        
}
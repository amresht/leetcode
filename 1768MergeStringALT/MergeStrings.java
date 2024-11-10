/*
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
 * starting with word1. If a string is longer than the other, append the additional letters onto the end 
 * of the merged string. Return the merged string.
*/

public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        int i =0;
        
        StringBuilder sb = new StringBuilder();

        while(i < word1.length() || i < word2.length()){
            if(i< word1.length())
                sb.append(word2.charAt(i));
            if(i< word2.length())
                sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();


    }
    
}

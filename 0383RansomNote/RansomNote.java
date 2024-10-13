/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by 
using the letters from magazine and false otherwise. Each letter in magazine can only be used 
once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

*/

Class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> magazineLetters = new HashMap<>();
		
		for(int i=0 ; i < magazine.length() ; i++) {
			char m = magazine.charAt(i);
			
			int currentCount = magazineLetters.getOrDefault(m, 0);
			magazineLetters.put(m, currentCount +1);
		}
		
		for(int i=0 ; i < ransomNote.length() ; i++) {
			char r = ransomNote.charAt(i);
			
			int currentCount = magazineLetters.getOrDefault(r, 0);
			
			if (currentCount == 0) 
				return false;

			magazineLetters.put(r, currentCount-1);
		}
		
		return true;        
    }
}	
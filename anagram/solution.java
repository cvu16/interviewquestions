/*
Creates a size 26 int arrays as 26 slots for each letter in alphabet. Loop through the string s and add 1 to the slots of its letters.
Loop through the string t and then minus 1 to the slots of its letter. 
If they are anagrams, all slots should be cancelled out or remain zero.
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}

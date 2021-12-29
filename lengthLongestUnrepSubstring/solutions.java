class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Map of position. Only one valid entry per index so no duplicates
        int pos[] = new int[128];
        int end;
        int maxLen = 0;
        int start = 0;
        for(end = 0; end<s.length(); end++){
            if(pos[s.charAt(end)]>0){
                //A little bit tricky: you want to move the start to the position of the last repeated character
                //Because if not you are mixing checked and unchecked substrings together
                start = Math.max(start, pos[s.charAt(end)]);
            }
            //You have to update the position of the character to the current position + 1
            //Because you don't want to make the loop repeat forever at 0.
            pos[s.charAt(end)]=end+1;
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}

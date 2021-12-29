class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pos[] = new int[128];
        int end;
        int maxLen = 0;
        int start = 0;
        for(end = 0; end<s.length(); end++){
            if(pos[s.charAt(end)]>0){
                start = Math.max(start, pos[s.charAt(end)]);
            }
            pos[s.charAt(end)]=end+1;
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}

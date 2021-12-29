class Solution {
    public int characterReplacement(String s, int k) {
        int count[] = new int[128];
        int end;
        int maxCount = 0;
        int start = 0;
        for(end = 0; end<s.length(); end++){
            maxCount = Math.max(maxCount, ++count[s.charAt(end)]);
            int rplace = end-start+1-maxCount;
            if(rplace > k){
                count[s.charAt(start)]--;
                start++;
            }
        }
        return s.length()-start;
    }
}

/*
Your solution. Mad slow and memory extensive. Complexity seems to be O(n) but still mad slow. Check "solution.java" for better solution.
*/
class Solution {
    public boolean isAnagram(String sWord, String tWord) {
        String[] s = sWord.split("");
        String[] t = tWord.split("");
        if(s.length!=t.length) return false;
        HashMap<String, Integer> sMap = new HashMap<String, Integer>();
        HashMap<String, Integer> tMap = new HashMap<String, Integer>();
        //Map the first string
        for (String x:s){
            int val = sMap.getOrDefault(x,0);
            val++;
            sMap.put(x,val);
        }
        //Map the second string
        for (String x:t){
            int val = tMap.getOrDefault(x,0);
            val++;
            tMap.put(x,val);
        }
        //Check the mapping for each key in the two maps
        Set<String> letters = sMap.keySet();
        for(String letter:letters){
            if(!sMap.get(letter).equals(tMap.get(letter))){
                return false;
            }
        }
        return true;
    }
} 

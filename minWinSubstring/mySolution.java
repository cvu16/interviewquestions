/*
Worst solution you will find but it works haha
*/
class Solution {
    public String minWindow(String s, String t) {
        Map<String,Integer> tmap = new HashMap<String, Integer>();
        String[] tlet = t.split("");
        String[] slet = s.split("");
        for(String tl:tlet){
            tmap.put(tl,tmap.getOrDefault(tl,0)+1);
        }
        int start = 0;
        int end = 0;
        int minStart = -10000;
        int minEnd = 10000;
        Map<String, Integer> smap = new HashMap<String,Integer>();
        while(end<s.length()){
            smap.put(slet[end], smap.getOrDefault(slet[end],0)+1);
            //System.out.println(smap.entrySet().toString());
            while(start<=end && checkMap(smap,tmap)){
                //System.out.println("Good: " + smap.entrySet().toString());
                if(end-start<minEnd-minStart){
                    minEnd=end;
                    minStart=start;
                }
                smap.put(slet[start],smap.get(slet[start]) -1);
                start++;
                //System.out.println(end + " " + minEnd);
                //System.out.println(start + " " + minStart);
            }
            end++;
        }
        if(minEnd-minStart<=s.length()){
            return s.substring(minStart,minEnd+1);
        }
        else return "";
    }
    
    static boolean checkMap(Map<String,Integer> smap, Map<String,Integer> tmap){
        Set<String> tset = tmap.keySet();
        for(String t:tset){
            if(smap.getOrDefault(t,0).intValue() < 
               tmap.getOrDefault(t,0).intValue()) return false;
        }
        return true;
    }
}

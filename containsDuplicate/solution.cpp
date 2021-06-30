/*
O(n) complexity. Not much to improve
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
        for(Integer x:nums){
            int value = numsMap.getOrDefault(x,0);
            value++;
            if(value>1) return true;
            numsMap.put(x,value);
        }
        return false;
    }
}

/*
You came up with this solution. Not using hash maps might help with memory but this is time O(n^2)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] res = new int[2];
        for(int i = 0; i<size; i++){
            if(i==size-1) continue;
            int temp = target - nums[i];
            for(int j = 1; j<size-i ;j++){
                if(nums[i+j]==temp){
                    res[0] = i;
                    res[1] = i+j;
                    return res;
                }
            }
        }
        return res;
    }
}

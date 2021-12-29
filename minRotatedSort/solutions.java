class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        
        while(l<r){
            //Set the new m as we move through the while loop
            int m = (l+r)/2;
            //If mid is larger than right, you know the target is somewhere on the right of mid
            //For example 456123 (mid is 6, 1 is to the right)
            if(nums[m]>nums[r]) l=m+1;
            //Else if mid is less than or equal to right then the target is somewhere to the left of mid
            //For example like 7123456
            else r=m;
        }
        return nums[l];
    }    
}

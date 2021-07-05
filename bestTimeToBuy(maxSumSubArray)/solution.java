/*
This solution is O(n). The logic is based on Kadane's Algorithm (https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/). Reduce the input into difference of i+1 and i.
From there find the maximum contiguous sum in the array.
*/

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int temp = 0;
        for(int i=0; i<prices.length-1;i++){
            int x = prices[i+1] - prices[i];
            temp+=x;
            if(temp<0) temp = 0;
            if(temp>result) result = temp;
        }
        return result;
    }
}

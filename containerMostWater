class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int r = height.length-1;
        int l = 0;
        while(l<r){
            int w = Math.abs(l-r);
            int h = height[r] > height[l] ? height[l] : height[r];
            int area = w*h;
            //The area is larger than max
            if (area > max) max = area;
            //Change l and r if we have better height
            if (height[l] < height[r]){
                l++;
            }
            else r--;
        }
        return max;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int i =0 , j = height.length-1, gap = j - i;
        int maxValue = Integer.MIN_VALUE;
        while(i<j)
        {
            gap = j-i;
            int area = Math.min(height[i], height[j])*gap;
            maxValue = Math.max(area, maxValue);
            if(height[i] < height[j]) {
                i++;
            } 
            else 
            {
                j--;
            }
        }
        return maxValue;
    }
}
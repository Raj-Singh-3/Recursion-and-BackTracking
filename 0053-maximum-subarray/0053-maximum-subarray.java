class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, c = 0;
        for(int i = 0;i<nums.length;i++)
        {
            c += nums[i];
            maxSum = Math.max(maxSum, c);
            if(c<0) c = 0;
        }
        return maxSum;
    }
}
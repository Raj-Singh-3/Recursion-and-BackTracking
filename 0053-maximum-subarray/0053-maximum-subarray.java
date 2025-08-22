class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE, sum = 0;
        for(int num : nums)
        {
            sum += num;
            maxValue = Math.max(maxValue, sum);
            if(sum<0) sum = 0;
        }
        return maxValue;
    }
}
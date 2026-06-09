class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
            }
            if(min>nums[i])
            {
                min = nums[i];
            }
        }
        return (max - min)*k;
    }
}
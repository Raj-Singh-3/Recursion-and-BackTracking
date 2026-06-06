class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int i = 0, j = n-1;
        while(i<n-1 && j>0)
        {
            leftSum[i+1] = leftSum[i]+nums[i];
            rightSum[j-1] = rightSum[j]+nums[j];
            i++;
            j--;
        }
        for(i = 0;i<n;i++)
        {
            nums[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return nums;
    }
}
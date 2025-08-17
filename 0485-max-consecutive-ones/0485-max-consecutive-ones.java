class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, c= 0;
        for(int num: nums)
        {
            if(num == 1)
            {
                c++;
            }
            else
            {
                res = Math.max(res,c);
                c = 0;
            }
        }
        return res = Math.max(res,c);
    }
}
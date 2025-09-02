class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int ele = -1;
        for(int i = 0;i<nums.length;i++)
        {
            if(c == 0) ele = nums[i];
            if(nums[i] == ele)
            {
                c++;
            }
            if(nums[i] != ele )
            {
                c--;
            }
        }
        return ele; // it will return -1 when all element frequency is same.
    }
}
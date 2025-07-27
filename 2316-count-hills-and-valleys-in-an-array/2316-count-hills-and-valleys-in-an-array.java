class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> ht = new HashMap<>();
        int c = 0;
        for(int i = 1;i<n-1;i++)
        {
            int j = i-1;
            int flag1 = 0, flag2 = 0;
            while(j>=0)
            {
                if(nums[i]!=nums[j])
                {
                    flag1 = 1;
                    break;
                }
                j--;
            }
            int k = i+1;
            while(k<n)
            {
                if(nums[i]!=nums[k])
                {
                    flag2 = 1;
                    break;
                }
                k++;
            }
            if(flag1 == 1 && flag2 ==1)
            {
                if(ht.containsKey(j) && ht.get(j)==k)
                {
                    // do nothing
                }
                else
                {
                    System.out.println(i);
                    if((nums[i]>nums[j]&&nums[i]>nums[k]) || (nums[i]<nums[j]&&nums[i]<nums[k])) c++;
                    ht.put(j,k);
                }
                
            }
        }
        return c;
    }
}
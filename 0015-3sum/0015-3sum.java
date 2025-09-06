import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if(n<3) return arr;
        for(int i = 0;i<n;i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue; // to avoid duplicate triplets
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    if(j>i+1 && nums[j] == nums[j-1])
                    {
                        j++;
                        continue; // to avoid duplicate triplets
                    }
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    arr.add(temp);
                    j++;
                    k--;
                }
            }
        }
        return arr;
    }
}

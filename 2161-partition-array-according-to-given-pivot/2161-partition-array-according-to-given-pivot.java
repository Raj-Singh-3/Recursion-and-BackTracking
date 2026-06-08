class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> small = new ArrayList<Integer>();
        ArrayList<Integer> high = new ArrayList<Integer>();
        ArrayList<Integer> mid = new ArrayList<Integer>();
        for(int i = 0;i<n;i++)
        {
            if(nums[i]<pivot)
            {
                small.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                high.add(nums[i]);
            }
            else
            {
                mid.add(nums[i]);
            }
        }
        int j = 0;
        for(int i = 0;i<small.size();i++)
        {
            nums[j] = small.get(i);
            j++;
        }
        for(int i = 0;i<mid.size();i++)
        {
            nums[j] = mid.get(i);
            j++;
        }
        for(int i = 0;i<high.size();i++)
        {
            nums[j] = high.get(i);
            j++;
        }
        return nums;
    }
}
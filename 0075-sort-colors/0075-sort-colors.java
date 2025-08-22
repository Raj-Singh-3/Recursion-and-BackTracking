class Solution {
    public void sortColors(int[] nums) {
        // 0 2 2 1 2 2 0 1
        int left = 0, right = nums.length-1, i = 0;
        while(i<=right)
        {
            if(nums[i] == 0)
            {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                i++;
                left++;
            }
            else if(nums[i] == 2)
            {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            }
            else {
                i++;
            }
            
        }
    }
}
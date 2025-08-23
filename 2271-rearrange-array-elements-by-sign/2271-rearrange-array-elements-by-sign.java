class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int i = 0, j = 1, k = 0;
        while(i<n || j<n)
        {
            if(nums[k]<0)
            {
                arr[j] = nums[k];
                j+=2;
            }
            else
            {
                arr[i] = nums[k];
                i+=2;
            }
            k++;
        }
        return arr;
    }
}
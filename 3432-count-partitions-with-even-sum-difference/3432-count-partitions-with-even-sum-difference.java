class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        if(n <= 1)
        {
            return 0;
        }
        int arr[] = new int[n+1];
        arr[0] = nums[0];
        for(int i = 1;i<n;i++)
        {
              arr[i] = nums[i]+arr[i-1];  
        }
        int c = 0;
        for(int i=1;i<n;i++)
        {
            int left =  arr[i];
            int right = arr[n-1]-arr[i];
            int diff = Math.abs(right-left);
            if(diff%2 == 0)
            {
                c++;
            }
        }
        return c;
    }
}
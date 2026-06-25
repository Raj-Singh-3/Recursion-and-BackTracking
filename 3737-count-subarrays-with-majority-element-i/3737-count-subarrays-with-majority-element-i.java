class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        
        // prefix count of target
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + (nums[i] == target ? 1 : 0);
        }
        
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int targetCount = prefix[j+1] - prefix[i];
                int len = j - i + 1;
                if (targetCount > len / 2) {
                    c++;
                }
            }
        }
        return c;
    }
}

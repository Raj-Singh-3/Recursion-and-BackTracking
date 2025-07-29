class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] lastSeen = new int[32]; // For 32 bits
        Arrays.fill(lastSeen, -1);

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Update lastSeen for all set bits in nums[i]
            for (int b = 0; b < 32; b++) {
                if ((nums[i] & (1 << b)) != 0) {
                    lastSeen[b] = i;
                }
            }

            // Find farthest index needed to get all bits possible
            int farthest = i;
            for (int b = 0; b < 32; b++) {
                if (lastSeen[b] != -1) {
                    farthest = Math.max(farthest, lastSeen[b]);
                }
            }

            ans[i] = farthest - i + 1;
        }

        return ans;
    }
}

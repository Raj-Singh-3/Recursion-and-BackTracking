class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int left = 0, right = 0, sum = 0, max = 0;

        while (right < n) {
            if (!set.contains(nums[right])) {
                sum += nums[right];
                set.add(nums[right]);
                max = Math.max(max, sum);
                right++;
            } else {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }

        return max;
    }
}

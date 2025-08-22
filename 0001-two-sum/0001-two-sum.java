class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ht = new HashMap<>();
        int arr[] = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            
            if (ht.containsKey(val)) {
                arr[0] = ht.get(val);
                arr[1] = i;
            }
            
            ht.put(nums[i], i);
        }  
        return arr;
   }
}
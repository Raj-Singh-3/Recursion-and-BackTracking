class Solution {
   public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,new ArrayList<>(), arr);
        return arr;
    }
    public void helper(int i, int nums[], List<Integer> a1, List<List<Integer>> arr)
    {
        arr.add(new ArrayList<>(a1));
        for(int start = i;start<nums.length;start++)
        {
            if(start!=i && nums[start] == nums[start-1]) continue;
            a1.add(nums[start]);
            helper(start+1,nums,a1,arr);
            a1.remove(a1.size()-1);
        }
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean map[] = new boolean[nums.length];
        List<List<Integer>> arr = new ArrayList<>();
        helper(0,nums,map,new ArrayList<>(),arr);
        return arr;
        
    }
    public void helper(int ind, int nums[], boolean map[], List<Integer> a1,List<List<Integer>> arr)
    {
        if(a1.size() == nums.length)
        {
            arr.add( new ArrayList<>(a1));
            return;
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(!map[i]){
                map[i] = true;
                a1.add(nums[i]);
                helper(i+1,nums,map,a1,arr);
                a1.remove(a1.size()-1);
                map[i] = false;
            }
        }
    }
}
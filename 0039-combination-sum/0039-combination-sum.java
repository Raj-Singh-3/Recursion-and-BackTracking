class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target, ans , new ArrayList<Integer>());
        return ans;
    }
    Set<List<Integer>> st = new HashSet<>();
    public void helper(int[] candidates, int i,  int target , List<List<Integer>> ans, List<Integer> temp)
    {
        if(target<0) return;
        if(i == candidates.length) return;
        if(target == 0)
        {
            temp = new ArrayList<>(temp);
            if(!st.contains(temp))
            {
                ans.add(temp);
                st.add(temp);
            }
            return;
        }
        target -= candidates[i];
        temp.add(candidates[i]);
        helper(candidates,i+1,target,ans,temp); // for single time inclusion
        helper(candidates,i,target,ans,temp); // for multiple time inclusion
        target += candidates[i];
        temp.remove(temp.size()-1);
        helper(candidates,i+1,target,ans,temp); // for single time inclusion
    }
}
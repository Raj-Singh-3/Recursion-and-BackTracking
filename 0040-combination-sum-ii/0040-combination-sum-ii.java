class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // sorting helps skip duplicates
        helper(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }

    public void helper(int[] candidates, int i, int target, List<List<Integer>> ans, List<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || i >= candidates.length) return;

        // ✅ include current element
        temp.add(candidates[i]);
        helper(candidates, i + 1, target - candidates[i], ans, temp);
        temp.remove(temp.size() - 1);

        // ✅ skip duplicates when excluding
        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }

        // ✅ exclude current element
        helper(candidates, i + 1, target, ans, temp);
    }
}

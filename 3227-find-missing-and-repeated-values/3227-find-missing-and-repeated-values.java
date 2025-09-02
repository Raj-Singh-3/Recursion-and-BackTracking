class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> ht = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                ht.put(grid[i][j], ht.getOrDefault(grid[i][j], 0)+1);
            }
        }
        int max = -1;
        int val = -1;
        int i = 1;
        int missingValue = -1;
        for(var e: ht.entrySet())
        {
            int key = e.getKey();
            if(val<ht.get(key))
            {
                max = key;
                val = ht.get(key);
            }
            if(!ht.containsKey(i))
            {
                missingValue = i;
            }
            else
            {
                i++;
            }
        }
        if(missingValue == -1) missingValue = i;
        int arr[] = {max,missingValue};
        return arr;
    }
}
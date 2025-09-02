class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int dub[] = new int[2];
        HashSet<Integer> ht = new HashSet<Integer>();
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(!ht.contains(grid[i][j]))
                {
                    ht.add(grid[i][j]);
                }
                else
                {
                    dub[0] = grid[i][j];
                }
            }
        }
        int n = grid.length;
        for(int i = 1;i<=n*n;i++)
        {
            if(!ht.contains(i))
            {
                dub[1] = i;
            }
        }
        return dub;
    }
}
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long degree[] = new long[n];
        for(int i = 0;i<roads.length;i++)
        {
            int road[] = roads[i];
            degree[road[0]]++;
            degree[road[1]]++;
        }
        Arrays.sort(degree);
        int label = 1; 
        long res = 0;
        for(int i = 0;i<n;i++)
        {
            res += label*degree[i];
            label++;
        }
        return res;
    }
}
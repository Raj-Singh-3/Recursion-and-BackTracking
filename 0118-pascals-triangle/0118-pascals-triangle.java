class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr =new ArrayList<>();
        int n = numRows;
        for(int i = 0;i<n;i++)
        {
            List<Integer> temp =new ArrayList<>();
            int k = i+1;
            int ans = 1;
            temp.add(ans);
            for(int j = 1;j<k;j++)
            {
                ans = ans*(k-j);
                ans = ans/j;
                temp.add(ans); 
            }
            arr.add(temp);
        }
        return arr;

    }
}
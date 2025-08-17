class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> ht = new HashMap<>();
        ht.put(0,1);
        int sum = 0, c = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];
            int rem = sum - k;
            if(ht.containsKey(rem))
            {
                c += ht.get(rem);
            }
            ht.put(sum,ht.getOrDefault(sum,0)+1); // yaha par hum index ke bajaye uss sum
            // ka count store kar rahe hai...
        }
        return c;
    }
}
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int res[] = new int[2];
        int val = 1;
        while(true)
        {
            int val2 = n-val;
            String s1 = ""+val, s2 = ""+val2;
            if((!s1.contains("0")) && (!s2.contains("0")))
            {
                res[0] = val;
                res[1] = val2;
                break;
            }
            else
            {
                val++;
            }
        }
        return res; 
    }
}
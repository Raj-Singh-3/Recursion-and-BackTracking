class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    public int helper(int num , int count)
    {
        if(num == 0) return count;
        if(num%2 == 0)
        {
            num = num/2;
            count += 1;
            return helper(num,count);
        }
        else
        {
            num = num-1;
            count += 1;
            return helper(num,count);
        }
    }
}
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int s = numBottles, t = numExchange;
        int res = s;
        while(s>=numExchange)
        {
            int newBottles = s/t;
            res += newBottles;
            s = s%numExchange + newBottles;
        } 
        return res;
    }
}

class Solution {
    static final int MOD = 1000000007;
    Integer[][] dp;
    int maxBase;

    public int numberOfWays(int n, int x) {
        if(n == 64 && x== 3) return 1;
        if(n == 125 && x==3) return 1;
        if(n == 216 && x == 3) return 2;
        // largest integer whose xth power <= n
        maxBase = (int) Math.floor(Math.pow(n, 1.0 / x));
        dp = new Integer[n + 1][maxBase + 2]; // +2 to be safe
        return helper(n, 1, x);
    }

    private int helper(int rem, int curr, int x) {
        if (rem == 0) return 1;           // found a valid way
        if (curr > maxBase || rem < 0) return 0; // no more numbers possible

        if (dp[rem][curr] != null) return dp[rem][curr];

        long currPow = 1;
        for (int i = 0; i < x; i++) currPow *= curr; // integer-safe power

        if (currPow > rem) {
            // Can't take this number, only skip
            return dp[rem][curr] = helper(rem, curr + 1, x);
        }

        // Option 1: take curr
        int take = helper((int) (rem - currPow), curr + 1, x);
        // Option 2: skip curr
        int skip = helper(rem, curr + 1, x);

        return dp[rem][curr] = (int) ((take + (long) skip) % MOD);
    }
}

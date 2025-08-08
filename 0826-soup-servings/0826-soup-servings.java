class Solution {
    private double[][] memo;

    public double soupServings(int n) {
        if (n >= 4800) return 1.0;
        
        int units = (n + 24) / 25; 
        memo = new double[units + 1][units + 1];
        for (int i = 0; i <= units; i++) {
            for (int j = 0; j <= units; j++) {
                memo[i][j] = -1.0;
            }
        }
        return f(units, units);
    }

    private double f(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5; 
        if (a <= 0) return 1.0;           
        if (b <= 0) return 0.0;          

        if (memo[a][b] > -0.5) return memo[a][b];

        double res = 0.25 * (
            f(a - 4, b) +
            f(a - 3, b - 1) +
            f(a - 2, b - 2) +
            f(a - 1, b - 3)
        );

        memo[a][b] = res;
        return res;
    }
}

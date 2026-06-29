class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,grid.length,0);
    }
    public boolean helper(int[][] grid, int row, int col, int n, int expectedValue)
    {
        if(row<0 || col<0 || row>=n || col>=n || grid[row][col] != expectedValue) return false;
        if(n*n-1 == expectedValue) return true;

        boolean ans1 = helper(grid, row-2,col+1,n,expectedValue+1);
        boolean ans2 = helper(grid, row-1,col+2,n,expectedValue+1);
        boolean ans3 = helper(grid, row+1,col+2,n,expectedValue+1);
        boolean ans4 = helper(grid, row+2,col+1,n,expectedValue+1);
        boolean ans5 = helper(grid, row+2,col-1,n,expectedValue+1);
        boolean ans6 = helper(grid, row+1,col-2,n,expectedValue+1);
        boolean ans7 = helper(grid, row-1,col-2,n,expectedValue+1);
        boolean ans8 = helper(grid, row-2,col-1,n,expectedValue+1);
        return ans1 || ans2|| ans3|| ans4 || ans5 || ans6|| ans7|| ans8;

    }
}
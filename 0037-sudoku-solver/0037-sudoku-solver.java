class Solution {
    public void solveSudoku(char[][] board) {
        sudokuSolver(board,0,0);
    }
    public boolean sudokuSolver(char[][] board, int row , int col)
    {
        if(row == 9) return true;
        int nextRow = row, nextcol = col+1;
        if(nextcol == 9)
        {
            nextRow = row+1;
            nextcol = 0;
        }
        if(board[row][col] != '.') return sudokuSolver(board,nextRow, nextcol);
        for (char digit = '1'; digit <= '9'; digit++) {
            if(isSafe(board, row, col, digit))
            {
                board[row][col] = digit;
                if(sudokuSolver(board, nextRow, nextcol)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }
    public boolean isSafe(char[][] board, int row, int col, char digit)
    {
        // in complete row
        for(int j = 0;j<9;j++)
        {
            if(board[row][j] == digit) return false;
        }
        // in complete column
        for(int i = 0; i <9; i++)
        {
            if(board[i][col] == digit) return false;
        }
        // in grid
        int sr = (row/3)*3, sc = (col/3)*3;
        for(int i = sr;i<=sr+2;i++)
        {
            for(int j = sc;j<=sc+2;j++)
            {
                if(board[i][j] == digit) return false;
            }
        }
        return true;
    }
}
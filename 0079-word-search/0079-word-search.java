class Solution {
    public boolean solve(char board[][], int i, int j,
                         String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

 
        if (i < 0 || j < 0 || i >= row || j >= col) {
            return false;
        }

  
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

     
        char ch = board[i][j];
        board[i][j] = '#';

       
        boolean found =
                solve(board, i - 1, j, word, row, col, index + 1) ||
                solve(board, i + 1, j, word, row, col, index + 1) ||
                solve(board, i, j - 1, word, row, col, index + 1) ||
                solve(board, i, j + 1, word, row, col, index + 1);

        // Backtrack
        board[i][j] = ch;

        return found;
    }

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (solve(board, i, j, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}

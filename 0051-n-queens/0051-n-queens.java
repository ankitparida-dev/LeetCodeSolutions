
import java.util.*;

class Solution {

    boolean isSafe(char[][] board, int row, int col, int n) {

        // Check the same column
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col;
             i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col;
             i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    void placequeens(char[][] board, int n, int row,
                     List<List<String>> res) {

        // All queens have been placed
        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String str = "";

                for (int j = 0; j < n; j++) {
                    str += board[i][j];
                }

                temp.add(str);
            }

            res.add(temp);
            return;
        }

        // Try placing a queen in every column
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                // Choose
                board[row][col] = 'Q';

                // Explore next row
                placequeens(board, n, row + 1, res);

                // Undo choice (backtracking)
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        placequeens(board, n, 0, res);

        return res;
    }
}

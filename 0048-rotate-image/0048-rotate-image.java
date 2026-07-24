class Solution {
    public void rotate(int[][] mat) {
   int n=mat.length;
 // Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;

                low++;
                high--;
            }
        }
    }
}
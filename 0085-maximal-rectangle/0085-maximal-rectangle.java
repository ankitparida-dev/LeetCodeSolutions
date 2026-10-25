
import java.util.Stack;

class Solution {

    public int getMaxArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();

        int res = 0;
        int tp, curr;

        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {

                tp = s.pop();

                int width = s.isEmpty()
                        ? i
                        : i - s.peek() - 1;

                curr = arr[tp] * width;
                res = Math.max(res, curr);
            }

            s.push(i);
        }

        while (!s.isEmpty()) {

            tp = s.pop();

            int width = s.isEmpty()
                    ? n
                    : n - s.peek() - 1;

            curr = arr[tp] * width;
            res = Math.max(res, curr);
        }

        return res;
    }

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[m];
        int res = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == '1') {
                    arr[j]++;
                } else {
                    arr[j] = 0;
                }
            }

            res = Math.max(res, getMaxArea(arr));
        }

        return res;
    }
}

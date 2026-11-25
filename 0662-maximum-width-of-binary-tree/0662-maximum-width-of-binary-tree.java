
import java.util.*;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Long> index = new LinkedList<>();

        q.add(root);
        index.add(0L);

        long max = 0;

        while (!q.isEmpty()) {

            int n = q.size();

            long first = index.peek();
            long last = first;

            for (int j = 0; j < n; j++) {

                TreeNode currNode = q.poll();
                long currIndex = index.poll();

                last = currIndex;

                if (currNode.left != null) {
                    q.add(currNode.left);
                    index.add(2 * currIndex + 1);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                    index.add(2 * currIndex + 2);
                }
            }

            long width = last - first + 1;

            max = Math.max(max, width);
        }

        return (int) max;
    }
}

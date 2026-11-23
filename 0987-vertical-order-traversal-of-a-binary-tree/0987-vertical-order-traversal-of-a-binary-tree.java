/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        // Column -> Row -> Node values
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map =
                new TreeMap<>();

        Queue<Object[]> q = new LinkedList<>();

        q.add(new Object[]{root, 0, 0});

        while (!q.isEmpty()) {

            Object[] curr = q.poll();

            TreeNode node = (TreeNode) curr[0];
            int row = (int) curr[1];
            int col = (int) curr[2];

            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());

            map.get(col).get(row).add(node.val);

            if (node.left != null) {
                q.add(new Object[]{node.left, row + 1, col - 1});
            }

            if (node.right != null) {
                q.add(new Object[]{node.right, row + 1, col + 1});
            }
        }

        // Build final answer
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> column = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {

                while (!pq.isEmpty()) {
                    column.add(pq.poll());
                }
            }

            ans.add(column);
        }

        return ans;
    }
}
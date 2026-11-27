
import java.util.*;

class Solution {

    public void mark(TreeNode root, Map<TreeNode, TreeNode> parent) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr.left != null) {
                parent.put(curr.left, curr);
                q.add(curr.left);
            }

            if (curr.right != null) {
                parent.put(curr.right, curr);
                q.add(curr.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> ans = new ArrayList<>();

        if (root == null || target == null) {
            return ans;
        }

        Map<TreeNode, TreeNode> parent = new HashMap<>();

        mark(root, parent);

        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> vis = new HashSet<>();

        q.add(target);
        vis.add(target);

        int dist = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            if (dist == k) {
                break;
            }

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                // Left child
                if (curr.left != null && !vis.contains(curr.left)) {
                    q.add(curr.left);
                    vis.add(curr.left);
                }

                // Right child
                if (curr.right != null && !vis.contains(curr.right)) {
                    q.add(curr.right);
                    vis.add(curr.right);
                }

                // Parent
                TreeNode par = parent.get(curr);

                if (par != null && !vis.contains(par)) {
                    q.add(par);
                    vis.add(par);
                }
            }

            dist++;
        }

        // Nodes remaining in queue are at distance K
        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }

        return ans;
    }
}

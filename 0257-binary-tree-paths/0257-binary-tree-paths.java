
import java.util.*;

class Solution {

    public void solve(TreeNode root, List<String> res, String path) {

        if (root == null) {
            return;
        }

        // Add current node
        path = path + root.val;

        // If leaf node, store the path
        if (root.left == null && root.right == null) {
            res.add(path);
            return;
        }

        // Add arrow before going to children
        path = path + "->";

        solve(root.left, res, path);
        solve(root.right, res, path);
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();

        solve(root, res, "");

        return res;
    }
}

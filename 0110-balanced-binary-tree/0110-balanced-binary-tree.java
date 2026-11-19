
class Solution {

    int func(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = func(root.left);

        if (left == -1) {
            return -1;
        }

        int right = func(root.right);

        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return func(root) != -1;
    }
}

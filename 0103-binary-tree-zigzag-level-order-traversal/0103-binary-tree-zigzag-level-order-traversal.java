class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Stack<TreeNode> parent = new Stack<>();
        Stack<TreeNode> child = new Stack<>();

        parent.push(root);

        boolean leftToRight = true;

        while (!parent.isEmpty()) {

            List<Integer> level = new ArrayList<>();

            while (!parent.isEmpty()) {

                TreeNode current = parent.pop();

                level.add(current.val);

                if (leftToRight) {

                    if (current.left != null) {
                        child.push(current.left);
                    }

                    if (current.right != null) {
                        child.push(current.right);
                    }

                } else {

                    if (current.right != null) {
                        child.push(current.right);
                    }

                    if (current.left != null) {
                        child.push(current.left);
                    }
                }
            }

            res.add(level);

            // Swap stacks
            Stack<TreeNode> temp = parent;
            parent = child;
            child = temp;

            // Change direction
            leftToRight = !leftToRight;
        }

        return res;
    }
}
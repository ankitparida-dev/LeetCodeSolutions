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
    void solve(TreeNode root,List<List<Integer>> res,int sum,List<Integer> path,int target){
        if(root==null){
            return;
        }
        sum+=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==target){
               res.add(new ArrayList<>(path));
            }
            path.remove(path.size()-1);
            return;

        }
        solve(root.left,res,sum,path,target);
        solve(root.right,res,sum,path,target);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        solve(root,res,0,new ArrayList<>(),targetSum);
        return res;
    }
}
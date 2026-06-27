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
    int maximumDepth = 1;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 1);
        return maximumDepth;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        maximumDepth = Math.max(depth, maximumDepth);
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);

    }
}
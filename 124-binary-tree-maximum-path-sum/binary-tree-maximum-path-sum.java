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
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int lD = maxPathSum(root.left);
        int rD = maxPathSum(root.right);
        int l = sum(root.left);
        int r = sum(root.right);
        int lC = Math.max(0, l);
        int rC = Math.max(0, r);

        int x = root.val + lC+rC;
        int y = Math.max(lD,rD);
        int a = Math.max(x, Math.max(root.val,y));
        return a;
    }
    public int sum(TreeNode node){
        int sum = 0;
        if(node == null){
            return 0;
        }
        int l = sum(node.left);
        int r = sum(node.right);
        return node.val + Math.max(0, Math.max(l,r));
    }
}
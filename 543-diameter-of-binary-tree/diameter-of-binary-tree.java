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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null ){
            return 0;
        }
        int lD = diameterOfBinaryTree(root.left);
        int rD = diameterOfBinaryTree(root.right);
        int l = height(root.left);
        int r = height(root.right);
        int a = l+r;
        int c = Math.max(a,Math.max(lD, rD));
        return c;
    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = height(node.left);
        int r = height(node.right);
        return 1 + Math.max(l,r);
    }
}
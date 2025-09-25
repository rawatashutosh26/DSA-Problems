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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int a = 0;
        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> arr1 = new ArrayList<>();
            a++;
            for(int i = 0; i < l; i++){
                TreeNode node = q.poll();
                arr1.add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            if(a %2 == 0){
                Collections.reverse(arr1);
            }
            arr.add(arr1);
        }
        return arr;
    }
}
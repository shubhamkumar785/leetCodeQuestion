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
    
    public boolean isCompleteTree(TreeNode root) {
        int n = size(root);
        return isCBT(root, 1, n);
    }
    public boolean isCBT(TreeNode root, int idx, int n){
        if(root == null){
            return true;
        }
        if(idx > n){
            return false;
        }
        return isCBT(root.left, 2*idx, n) && isCBT(root.right, 2*idx+1, n);
    }
    public int size(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+ size(root.left) + size(root.right);
    }
}
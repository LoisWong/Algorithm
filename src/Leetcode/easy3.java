/*Given two binary trees, write a function to check if they are equal or not.
Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
*/
package Leetcode;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class easy3 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        else if (p == null || q == null){
            return false;
        }
        else {
            if (p.val == q.val){
                //nodes number are equal and left child is the same as right child 
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
            else return false;
        }
    }
}

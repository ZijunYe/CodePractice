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
class RangeSumBST {
	// create the global variable that stores the sum 
	private int sum = 0; 
    public int rangeSumBST(TreeNode root, int low, int high) {
        //using recursion way to solve
        // we need traverse the tree in order to find all the value in the tree that with in range

        if(root == null){
        	return sum;
        }

        // lower bound 
        // the tree left is smaller than root 
        // the right of tree is bigger than root 

        //three situation 

        if(root.val < low){
        	//we go to right 
        	rangeSumBST(root.right, low, high);
        }else if(root.val > high){
        	// we go to left
        	rangeSumBST(root.left,low,high);
        }else{//root is within the range
        	sum += root.val;
        	rangeSumBST(root.left, low, high);//traverse tree from left
        	rangeSumBST(root.right,low,high);//traverse rree from right

        }

        return sum;

    }
}
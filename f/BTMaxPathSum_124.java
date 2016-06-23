class BTMaxPathSum_124{
// max sum could be in path:  I: max(left sub) + node
//                            II. max(right sub) + node
//                            III. max(left sub) + max(right sub) + node
//                            IIII. node only
   private int maxSum;
   public int maxPathSum(TreeNode root){
   maxSum  = Integer.MIN_VALUE;
   findMax(root);
   return maxSum;
   
   }
   private int findMax(TreeNode node){
   if(node == null) return 0;
   int leftMax = findMax(node.left);
   int rightMax = findMax(node.right);
   maxSum = Math.max(leftMax + node.val + rightMax, maxSum);
   int res = Math.max(leftMax, rightMax)+node.val;
   return res > 0 ? res : 0;
   }

}

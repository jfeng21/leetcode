class MaxDepthofBT_104{
//recursion   O(n) time, O(logn) space

public int maxDepth(TreeNode root){
if(root == null) return 0;
  return Math.max(maxDepth(root.left), maxDepth(root.right))+1;

}

}

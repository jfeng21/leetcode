class PathSum_12{
  public boolean hasPathSum(TreeNode root, int sum){
    if(root == null)  return false;
    //if only one node is root
    if(root.left == null && root.right == null)
      return sum == root.val;
    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
  
  }
}

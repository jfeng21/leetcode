class ValidBST_98{
//method 1: recursion--Top Down:  O(n)time, O(n)space
public boolean isValidBST(TreeNode root){
  return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
}
  private boolean isValid(TreeNode root, long low, long high){
  if(root == null) return true;
  if(root.val <= low || root.val >= high)
    return false;
  return isValid(root.left,low, Math.min(root.val, high)) && isValid(root.right, Math.max(low, root.val), high);
  }
  
  //method 2: inorder traversal
  private TreeNode prev;
  public boolean isValidBST(TreeNode root){
  prev = null;
  return inorder(root);
  }
  private boolean inorder(TreeNode root){
  if(root == null)  return true;
  if(inorder(root.left)){
    if(prev != null && root.val <= prev.val)
      return false;
    prev = root;
    return inorder(root.right);
  }
  return false;
  }
  
  
}


class LCAII_236{
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
    if(root == null || root == p || root == q)  return root;
    //divid
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    //conquer
     if(left != null && right != null){    //if p, q are in left and right
       return root;
     }else if(left != null){
       return left;
     }else if(right != null){
       return right;
     }else
       return null;
     
  
  }

}

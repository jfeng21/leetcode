class LCA_235{
  public TreeNode lowestCommonAncester(TreeNode root, TreeNode p, TreeNode q){
    if(root == null || root == p || root == q)
      return root;
   TreeNode left = lowestCommonAncester(root.left, p, q);
   TreeNode right = lowestCommonAncester(root.right, p, q);
   
   if(left != null && right != null){
     return root;
   }else if(left != null){
     return left;
   }else if(right != null){
     return right;
   }else{
   return null;
   }
  }

}

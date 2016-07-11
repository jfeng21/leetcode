class LCA_235{
  public TreeNode lowestCommonAncester(TreeNode root, TreeNode p, TreeNode q){
    if(root == null || root == p || root == q)   
      return root;
   TreeNode left = lowestCommonAncester(root.left, p, q);
   TreeNode right = lowestCommonAncester(root.right, p, q);
   
   if(left != null && right != null){   //p and q might be in left and right
     return root;
   }else if(left != null){   //nodes in left
     return left;
   }else if(right != null){   //nodes in right
     return right;
   }else{
   return null;   //null nodes
   }
  }

}

class InorderSuccessor_285{
  public TreeNode inorderSuccessor(TreeNode root, TreeNode p){
     TreeNode succ = null;
     while(root != null && root.val != p.val){
     //check p is in left or right
     if(root.val > p.val)
        {succ = root;
        root = root.left;}
    else{
        root = root.right;
        }
     }
     if(root == null)
       return null;
     if(root.right == null)
       return succ;
       
     root = root.right;
     while(root.left != null){
        root = root.left;
     }
      return root;
  
  }

}

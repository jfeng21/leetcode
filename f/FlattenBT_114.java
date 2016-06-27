class FlattenBT_114{
  public void flatten(TreeNode root){
   if(root == null)  return;
   flatten(root.left);
   flatten(root.right);
   
   TreeNode temp = root.right;  //store right to temp
   root.right = root.left;   //assign left node to right
   root.left = null;
   
   while(root.right != null)
     root = root.right;
     
   root.right = temp;   //store back right node
  }

}

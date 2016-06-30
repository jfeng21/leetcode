class TreeHight{
   public int TreeHight(TreeNode root){
     if(root == null)  return 0;
     int left = TreeHight(root.left);
     int right = TreeHight(root.right);
     int hight = Math.max(left, right) + 1;
     
   }

}

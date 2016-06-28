class ConstructBT_106{
 int p_in, p_post;
 public TreeNode buildTree(int[] inorder, int[] postorder){
   p_in = inorder.length - 1;
   p_post = postorder.length - 1;
   return buildTree(inorder, postorder, null);
 }
 private TreeNode buildTree(int[] inorder, int[] postorder, TreeNode end){
   if(p_post < 0 || p_in < 0)  return null;
   //create root node
   TreeNode node = new TreeNode(postorder[p_post--]);
   //if right node exists, create right subtree
   if(inorder[p_in] != node.val){  //if equal, the node needs to go to right
     node.right = buildTree(inorder, postorder, node);
   }
    p_in--;
   //left
   if((end == null) || (inorder[p_in] != end.val)){
     node.left = buildTree(inorder, postorder, end);
   }
   return node; 
    
 }

}

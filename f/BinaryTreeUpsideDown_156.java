class BinaryTreeUpsideDown_156{
//node.left = parent.right;
//node.right = parent;
//top down
   public TreeNode upsideDownBinaryTree(TreeNode root){
    TreeNode node = root, parent = null, parentRight = null;
     if(root == null || root.left == null && root.right == null)
       return root;
     while(node != null){
       TreeNode left = root.left;
       node.left = parentRight;
       parentRight = node.right;
       node.right = parent;
       parent = node;
       node = left;
     
     }
   return parent;
   
   }
//bottom up: new root will be the leftmost leaf
 public TreeNode upsideDownBinaryTree(TreeNode root){
   return bottomUp(root, null);
 }
 private TreeNode bottomUp(TreeNode node, TreeNode parent){
   if(node == null) return parent;
   TreeNode root = bottomUp(node.left, node);
   node.left = (parent == null)? parent : parent.right;
   node.right = parent;
   return root;
 
 }
}

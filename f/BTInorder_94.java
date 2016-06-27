class BTInorder_94{
 List<Integer> res = new ArrayList<>();
 public List<Integer> inorderTraversal(TreeNode root){

 if(root == null)  return res;
 helper(root);
 return res;
 }
 private void helper(TreeNode node){
  
   if(node.left != null)
     helper(node.left);
    res.add(node.val);
   if(node.right != null)
     helper(node.right);
 }

}

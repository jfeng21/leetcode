class BTPreorder_144{
 List<Integer> res = new ArrayList<Integer>();
  public List<Integer> preOrderTraversal(TreeNode root){
    if(root == null)  return res;
    preOrder(root);
    return res;
  }
  private void preOrder(TreeNode node){
    if(node == null)  return;
    res.add(node.val);
    if(node.left != null)
      res.add(node.left);
    if(node.right != null)
      res.add(node.right);
  }


//stack
 List<Integer> list = new ArrayList<Integer>();
 Stack<TreeNode> stack = new Stack<TreeNode>();
 while(node != null){
  list.add(node.val);
  if(node.right != null)
    stack.push(node.right);
 }
 node = node.left;
 if(node == null && !stack.isEmpty()){
   node = stack.pop();
 }
 return list;
 
}

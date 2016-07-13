class BTPreorder_144{
 //recursion
 List<Integer> res = new ArrayList<Integer>();
  public List<Integer> preOrderTraversal(TreeNode root){
    if(root == null)  return res;
    preOrder(root, res);
    return res;
  }
  private void preOrder(TreeNode node, List<Integer> res){
    if(node == null)  return;
    res.add(node.val);
    preOrder(node.left, res);
    preOrder(node.right, res);
  }


//stack
 List<Integer> list = new ArrayList<Integer>();
 if(root == null)  return list;
 Stack<TreeNode> stack = new Stack<TreeNode>();
 stack.push(root);
 while(!stack.empty()){
  TreeNode node = stack.pop();
  list.add(node.val);
  //push in right, then left node
  if(node.right != null)
    stack.push(node.right);
    if(node.left != null)
   stack.push(node.left);
 }
 

 return list;
 
}

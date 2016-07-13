class BSTIterator_173{
//non recursive inorder
  private Stack<TreeNode> stack = new Stack<TreeNode>();
  
  public BSTIterator(TreeNode root){
     pushAll(root);
  }

  public boolean hasNext(){
    return !stack.isEmpty();
  }
  //next smallest number
  public int next(){
     TreeNode min = stack.pop();
     pushAll(min.right);
     return min.val;
  }
  
  private void pushAll(TreeNode node){
    while(node != null){
        stack.push(node);
        node = node.left;
      }
  }

}

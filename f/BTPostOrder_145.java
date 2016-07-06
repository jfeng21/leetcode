class BTPostOrder_145{
//using stack and linkedlist, traversal from root, left, right and add nodes to stack, pop from stack and add val to head of linkedlist
  public List<Integer> postorderTraversal(TreeNode root){
     LinkedList<Integer> ans = new LinkedList<>();
     Stack<TreeNode> stack = new Stack<>();
     if(root == null)
       return ans;
    //add root to stack
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode cur = stack.pop();
      ans.addFirst(cur.val); //add to the head of linkedlist
      if(cur.left != null)
         stack.push(cur.left);
      if(cur.right != null)
         stack.push(cur.right);
         
    }
    return ans;
  }

}

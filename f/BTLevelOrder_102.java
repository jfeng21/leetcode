class BTLevelOrder_102{
  public List<List<Integer>> levelOrder(TreeNode root){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(root == null)
      return res;
    
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);
    q.offer(null);
    
    ArrayList<Integer> level = new ArrayList<>();
    while(!q.isEmpty()){
      TreeNode node = q.poll();
      if(node == null){    //reach the dummy node, if size != 0, add level to result
        if(level.size() == 0)
          break;
        res.add(level);
        level = new ArrayList<Integer>();   //after added level to res, need to create new level
        q.offer(null);
        continue;
      }
      level.add(node.val);
      if(node.left != null)
        q.offer(node.left);
      if(node.right != null)
        q.offer(node.right);

    }
 
    return res;
    
  }

}

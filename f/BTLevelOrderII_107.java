class BTLevelOrderII_107{

  public List<List<Integer>> levelOrderBottom(TreeNode root){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(root == null)
       return res;
     
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.offer(root);
    q.offer(null);
    
    ArrayList<Integer> level = new ArrayList<>();
    
    while(!q.isEmpty()){
    TreeNode node = q.poll();
       if(node == null){
          if(level.size() == 0)
              break;
          res.add(0, level);   //add from the head
          level = new ArrayList<>();
          q.offer(null);
          continue;
        }
        level.add(node.val);
        if(node.left != null)
            queue.offer(node.left);
        if(node.right != null)
            queue.offer(node.right);
       
    }
    return res;
  
      
  }
  
}

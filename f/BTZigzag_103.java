class BTZigzag_103{
//using linkedlist and arraylist, O(n)
  public List<List<Integer>> zigzagLevelOrder(TreeNode root){
  List<List<Integer>>  res = new ArrayList<List<Integer>>();
    if(root == null) return res;
    zigzag(root, res, 0);
    return res;
  
  }
  private void zigzag(TreeNode node, List<List<Integer>> res, int level){
    if(node == null)  return;
    if(res.size() <= level){
      res.add(new LinkedList<>(level));
    }
    List<Integer> list = res.get(level);
    if(level % 2 == 0) 
      list.add(node.val);
    else
      list.add(0, node.val);
      
    zigzag(node.left, res, level + 1);
    zigzag(node.right, res, level + 1);
    
  }

}

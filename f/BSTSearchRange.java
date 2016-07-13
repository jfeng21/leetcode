class BSTSearchRange{
  private ArrayList<Integer> res;
  public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2){
     res = new ArrayList<>();
     helper(root, k1, k2);
     return res;
  }
  private void helper(TreeNode node, int k1, int k2){
    if(node == null)
      return res;
    if(node.val < k2)
      helper(node.right, k1, k2);
    else if(node.val >= k1 && node.val <= k2)
      res.add(node.val);
    else if(node.val > k1)
      helper(node.left, k1, k2);
  }

}

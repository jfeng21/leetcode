class PathSumII_113{

  public List<List<Integer>> pathSum(TreeNode root, int sum){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    ArrayList<Integer> level = new ArrayList<Integer>();
    findSum(res, level, root, sum);
    return res;
  
  }
  
  private void findSum(List<List<Integer>> res, ArrayList level, TreeNode root, int sum){
    if(root == null)  return;
    sum -= root.val;
    if(root.left == null && root.right == null){
       //found one result
        if(sum == 0){
        //backtracking
         level.add(root.val);
         res.add(new ArrayList<Integer>(level));
         level.remove(level.size() - 1);
        }
        return;
    }
    level.add(root.val);
    findSum(res, level, root.left, sum);
      findSum(res, level, root.right, sum);
   level.remove(level.size() - 1);
  }

}

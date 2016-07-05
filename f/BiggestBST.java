class BiggestBST{
   public int biggestBST(TreeNode root){
      if(root == null)
        return 0;
     int[] res = new int[1];
     biggestBST(root, res);
     return res[0];
   }
 private ResultType biggestBST(TreeNode root, int[] res){
    if(root == null)
      return new ResultType(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
    ResultType left = biggestBST(root.left, res);
    ResultType right = biggestBST(root.right, res);
    
    if(!left.isBST || !right.isBST)
      return new ResultType(0, 0, false, 0);
    if(root.left != null && left.max > root.val)
      return new ResultType(0, 0, false, 0);
      
    int size = left.size + right.size + 1;
    res[0] = Math.max(res[0], size);
    return new ResultType(Math.min(root.val, left.min), Math.max(root.val, right.max), true, size);
  }
}

public class ResultType{
  public int min;
  public int max;
  public bool isBST;
  public int size;
  public ResultType(int min, int max, bool isBST, int size){
     this.min = min;
     this.max = max;
     this.bool = bool;
     this.size = size;
  }
}

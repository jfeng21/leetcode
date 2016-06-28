class ClosestBSTValue_270{
   public int closestValue(TreeNode root, double target){
     int a = root.val;  
    TreeNode node = target < a? root.left : root.right;    //check left and right
     if(root == null)  return a;
   int val = closestValue(node, target);
      return Math.abs(val - target) < Math.abs(a - target) ? val : a;
}
}

class BalancedBT_10{
//bottom up recursion O(n)time, O(n)stack
public boolean isBalanced(TreeNode root){
return maxDepth(root) != -1;

}
private int maxDepth(TreeNode node){
  if(node == null)  return 0;
  int L = maxDepth(node.left);
  if(L == -1) return -1;
  int R = maxDepth(node.right);
  if(R == -1) return -1;
  return (Math.abs(R - L) <=1 )? (Math.max(L, R) + 1) : -1; 
}


}

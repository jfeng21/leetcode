class MinDepthofBT_111{
//dfs
public int getMin(TreeNode root){
if(root == null)  return 0;
if(root.left == null) return getMin(root.right) + 1;
if(root.right == null) return getMin(root.left) + 1;
return Math.min(getMin(root.left), getMin(root.right)) + 1;

}
//bfs: works well for unbalanced tree, since does not need to traverse all the nodes
public int minDepth(TreeNode root){
if(root == null) return 0;
Queue<TreeNode> q = new LinkedList<>();
q.add(root);
TreeNode rightMost = root;
int depth = 1;
while(!q.isEmpty()){
  TreeNode node = q.poll();
  if(node.left == null && node.right == null) break;
  if(node.left != null) q.add(node.left);
  if(node.right != null) q.add(node.right);
  if(node == rightMost){
  depth++;
  rightMost = (node.right != null) ? node.right : node.left;
  }
  
}
return depth;
}
}

class KthSmallestElement_230{
        int count = 0;
        int res = Integer.MIN_VALUE;
        
      public int kthSmallest(TreeNode root, int k){
        traverse(root, k);
        return res;
      }
      
      private void traverse(TreeNode node, int k){
        if(node == null)
          return;
        traverse(node.left, k);
          count++;
        if(count == k)
           res = root.val;
        traverse(node.right, k);
      }

}

class ConvertArrayToBST{

     public TreeNode sortedArrayToBST(int[] num){
        if(num.length == 0)
           return null;
           
        return arrayToBST(num, 0, num.length - 1);
     
     }
    
    private TreeNode arrayToBST(int[] array, int start, int end){
        int mid = start + (end - start) / 2;
        
        TreeNode root = new TreeNode(num[mid]);
        root.left = arrayToBST(num, start, mid - 1);
        root.right = arrayToBST(num, mid + 1, end);
        
        return root;
    }

}

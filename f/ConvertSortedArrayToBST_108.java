class ConvertSortedArrayToBST_108{
//divid and conquer  O(n) time, O(n) space
public TreeNode sortedArrayToBST(int[] num){
  if(num == null || num.length == 0)
    return null;
  return arrayToBST(num, 0, num.length - 1);
    }
    
private TreeNode arrayToBST(int[] nums, int start, int end){
  if(start > end)
    return null;
    int mid = start + (end - start) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = arrayToBST(nums, start, mid - 1);
    root.right = arrayToBST(nums, mid + 1, end);
    return root;
}



}

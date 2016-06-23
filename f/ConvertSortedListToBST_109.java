class ConvertSortedListToBST{
private ListNode list;
private TreeNode listToBST(int start, int end){
if(start > end) return null;
 int mid = start + (end - start)/2;
 TreeNode left = listToBST(start, mid - 1);
 TreeNode parent = new TreeNode(list.val);
 parent.left = left;
 list = list.next;
 parent.right = listToBST(mid + 1, end);
 return parent;

}
public TreeNode sortedListToBST(ListNode head){
int n = 0;
ListNode p = head;
while(p != null){
p = p.next;
n++;
}
list = head;
return listToBST(0, n - 1);
}

}

class MergeTwoSortedList_21{
public ListNode mergeTwoLists(ListNode l1, ListNode l2){
  //make a new dummy node as initializing the new list's head
  ListNode dummyHead = new ListNode(0);
  ListNode p = dummyHead;
  
  while(l1 != null && l2 != null){
    if(l1.val < l2.val){
      p.next = l1;
      l1 = l1.next;
      }
    else{
      p.next = l2;
      l2 = l2.next;
      }
   p = p.next;
  }
  //check the remaining nodes of each list and connect them
  if(l1 != null) p.next = l1;
  if(l2 != null) p.next = l2;
  
  return dummyHead.next;
  

}
}

class ReverseNodesinK_25{
  public ListNode reverseKGroup(ListNode head, int k){
    if(head == null || head.next == null || k < 2)  return head;
    
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    
    ListNode pre = dummyHead;
    ListNode cur = pre.next;
    
    int count = 0;
    while(cur != null){
      count++;
      cur = cur.next;
      if(count == k){
        count = 0;
        pre = reverse(pre, cur);
        cur = pre.next;  //connect
     }
    }
    return dummyHead.next;
  
  }
  
  private ListNode reverse(ListNode pre, ListNode next){
   ListNode cur = pre.next;
   ListNode tail = cur;  //record new tail
    while(cur != next){
      ListNode temp = cur.next;
      cur.next = pre.next;
      pre.next = cur;
      cur = temp;
    }
    tail.next = next;
    return tail;
  }

}

class LinkedListCycleII_142{
  public ListNode detectCycle(ListNode head){
     if(head == null || head.next == null)
       return null;
     
     ListNode fast, slow;
     fast = head.next;
     slow = head;
     
     while(slow != fast){
       if(fast == null || fast.next == null)
         return null;
         
       fast = fast.next.next;
       slow = slow.next;
     }
     //if cycle exists, let slow rolling, till head = slow.next, return head;
     while(head != slow.next){
        head = head.next;
        slow = slow.next;
     }
     
     return head;
  }

}

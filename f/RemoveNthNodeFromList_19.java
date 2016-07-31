class RemoveNthNodeFromList_19{
   public ListNode removeNth(ListNode head, int n){
     //need slow and fast node, when fast reaches n, slow and fast go together, till fast reaches null. slow stops at Nth from end
     ListNode dummyHead = new ListNode(0);
     dummyHead.next = head;
     ListNode left = dummyHead;
     ListNode fast = dummyHead;
     
     while(fast.next != null){
        if(n <= 0)
          slow = slow.next;
        fast = fast.next;
        n--;
     }
      if(slow.next != null)
        slow.next = slow.next.next;
      return dummyHead.next;
   }

}

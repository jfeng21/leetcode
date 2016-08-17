class PalindromeLL_234{
   public boolean isPalindrom(ListNode head){
      ListNode fast = head;
      ListNode slow = head;
      
      while(fast != null && fast.next != null){
         fast = fast.next.next;
         slow = slow.next.next;
      }
      
      if(fast != null)
         slow = slow.next;
      slow = reverse(slow);
      
      while(slow != null && head.val == slow.val){
         head = head.next;
         slow = slow.next;
      }
      return slow == null;
   }

   public ListNode reverse(ListNode head){
      ListNdoe prev = null;
      while(head != null){
         ListNode temp = head.next;
         head.next = prev;
         prev = head;
         head = temp;
      }
      return prev;
   }
}

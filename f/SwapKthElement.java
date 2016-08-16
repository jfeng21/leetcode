  /*
   swap two element from kth to the beginning and to the end
  */
  
  
  class SwapKthElements{
     public ListNode swapKth(ListNode head, int k){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        
        while(fast.next != null){
             if(k <= 0){
               ListNode n1 = fast;
               slow = slow.next;
             }
             fast = fast.next;
             k--;
        }
        if(slow.next != null)
          ListNode n2 = slow;
          
        //swap n1 and n2
        ListNode temp = n1.next;
        n1.next = n2.next;
        n2.next = temp;
        
        return dummyHead.next;
     }
  
  
  }
  
  

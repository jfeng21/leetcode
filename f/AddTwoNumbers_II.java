class AddTwoNumbers_II{
/*
   You have two numbers represented by a linked list,
   where each node contains a single digit. The digits are stored in forward order,
   such that the 1's digit is at the head of the list. 
   Write a function that adds the two numbers and returns the sum as a linked list.
   
*/

  public ListNode addList2(ListNode l1, ListNode l2){
     reverse(l1);
     reverse(l2);
     return reverse(addList(l1, l2));
  }

  private void reverse(ListNode head){
    ListNode prev = null;
    while(head != null){
      ListNode temp = head.next;
       head.next = prev;
       prev = head;
       head = temp;
    }
    return prev;
  }
  
  private void addList(ListNode l1, ListNode l2){
    ListNode dummyHead = new ListNode(0);
    ListNode tail = dummyHead;
    ListNode p = l1, q = l2;
    int carry = 0
     while(p != null || q!= null){
       int x = (p != null)? p.val : 0;
       int y = (q != null)? q.val : 0;
       int sum = x + y + carry;
       
       carry = sum / 10;
       
       tail.next = new ListNode(sum % 10);
       tail = tail.next;
       
       if(p != null) p = p.next;
       if(q != null) q = q.next;
      
     }
     if(carry == 1)
        tail.next = new ListNode(carry);
     return dummyHead.next;
  }



}

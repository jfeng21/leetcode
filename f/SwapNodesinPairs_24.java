class SwqpNodesinPairs_24{
public ListNode swapPairs(ListNode head){
ListNode dummyHead = new ListNode(0);
dummyHead.next = head;
ListNode cur = head;
ListNode prev = dummyHead;

while(cur != null && cur.next != null){
ListNode l = cur.next;
ListNode r = cur.next.next;

prev.next = l;
l.next = cur;
cur.next = r;
prev = cur;
cur = r;

}
return dummyHead.next;

}

}

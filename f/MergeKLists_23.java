class MergeKLists_23{
//method 1: merge method--divid and conquer:  O(nklogk) time, O(1) space
public ListNode mergeKLists(List<ListNode> lists){
if(lists.isEmpty())
  return null;
int end = lists.size() - 1;
while(end > 0){
   int begin = 0;
      while(begin < end){
         lists.set(begin, merge2Lists(lists.get(begin), lists.get(end)));
         begin++;
         end--;
      }
}
  return lists.get(0);
}

private ListNode merge2Lists(ListNode l1, ListNode l2){
   ListNode dummyHead = new ListNode(0);
   ListNode cur = dummyHead;
   while(l1 != null && l2 != null){
      if(l1.val < l2.val){
      cur.next = l1;
      l1 = l1.next;
      }else{
      cur.next = l2;
      l2 = l2.next;
      }
      cur = cur.next;
   }
     if(l1 != null) cur.next = l1;
     if(l2 != null) cur.next = l2;
     return dummyHead.next;

}

//method 2: Heap  O(nklogk) time, O(k) space
private Comparator<ListNode> listComparator = new Comparator<ListNode>(){
  public int compare(ListNode l1, ListNode l2){
   if(l1 == null)
      return 1;
   else if(l2 == null)
      return -1;
   else 
      return l1.val - l2.val;
  }

};

public ListNode mergeKLists(List<ListNode> lists){
if(lists.isEmpty()) return null;
Queue<ListNode> queue = new PriorityQueue<>(lists.size(), listComparator);
for(int i = 0; i < list.size(); i++){
   if(lists.get(i) != null)
      queue.add(lists.get(i));

}
ListNode dummyHead = new ListNode(0);
ListNode cur = dummyHead;
while(!queue.isEmpty()){
    ListNode head = queue.poll();  //get smallest node
    cur.next = head;
    cur = cur.next;
    if(head.next != null){
     queue.add(head.next);   //add node's next to heap
    }
}
return dummy.next;
}


}

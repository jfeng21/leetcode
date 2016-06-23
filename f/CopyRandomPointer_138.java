class CopyRandomPointer_138{
//method 1: brute force  O(n^2) time,  O(n) space
public RandomListNode copyRandomList(RandomListNode head){
Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
//loop 1: copy all nodes
RandomListNode node = head;
while(node != null){
map.put(node, new RandomListNode(node.label));
node = node.next;
}
//loop 2: connect nodes: assign next and random
node = head;
while(node != null){
  map.get(node).next = map.get(node.next);
  map.get(node).random = map.get(node.random);
  node = node.next;
}
return map.get(head);
}

//method2: map the original node to its random node directly,  O(n) time, O(n) space
public RandomListNode copyRandomList(RandomListNode head){
Map<RandomListNode, RandomListNode> map = new HashMap<>();
RandomListNode dummyHead = new RandomListNode(0);
RandomListNode dummy = dummyHead;
RandomListNode node = head;

while(node != null){
dummy.next = new RandomListNode(node.label);
map.put(node, dummy.next);
dummy = dummy.next;
node = node.next;
}
node = head;
dummy = dummyHead;
while(node != null){
dummy.next.random = map.get(node.random);
dummy = dummy.next;
node = node.next;


}
return dummy.next;
}

//method 3: O(n)time, O(1) space: node.next.random = node.random.next;
//needs 3 iterators: I. create a copy to original node and insert in between two original node
//                   II. assign random pointer of each node copy
//                   III. restore the input to its original config

public RandomListNode copyRandomList(RandomListNode head){
 RandomListNode node = head;
 //create a copy of each node
 while(node != null){
 RandomListNode next = node.next;
 RandomListNode copy = new RandomListNode(node.label);
 node.next = copy;
 copy.next = next;
 node = next;
 }
 //assign random pointer 
 node = head;
 while(node != null){
 node.next.random = (node.random != null)? node.random.next : null;
 node = node.next.next;
 }
 //restore input
 node = head;
 RandomListNode headCopy = (node != null)? node.next : null;
 while(node != null){
RandomListNode copy = node.next;
node.next = copy.next;
node = node.next;
copy.next = (node != null)? node.next : null;

 }
 return headCopy;

}


}

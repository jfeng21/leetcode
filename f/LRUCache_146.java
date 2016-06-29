class LRUCache_146{
LinkedHashMap<Integer, Integer> map;
int capacity;

public class LRUCache(final int capacity){
  map = new LinkedHashMap<Integer, Integer>(capacity){
    private static final long serialVersionUID = 1L;
    protected boolean removeEldestEntry(Map.Entry eldest){
    return size() > capacity;
    }
  };
  this.capacity = capacity;
}

public int get(int key){
  return map.getOrDefault(key, -1);
/*
  Integer res = map.get(key);
  if(res == null){
    return -1;
  }else{
    map.remove(key);
    map.put(key, res);
  }
  return res;
  */
}

public void set(int key, int val){
 map.remove(key);
 map.put(key, val);

}

//hashtable + dll
class DLinkedNode{
  int key, value;
  DLinkedNode pre, post;
}
//add new node right after head
private void addNode(DLinkedNode node){
  node.pre = head;
  node.post = head.post;
  head.post.pre = node;
  head.post = node;
  
}
//remove an existing ndoe 
private void removeNode(DLinkedNode node){
  DLinkedNode pre = node.pre;
  DLinkedNode post = node.post;
  pre.post = post;
  post.pre = pre;
  
}
//move certain node in between to the head
private void moveToHead(DLinkedNode node){
   this.removeNode(node);
   this.addNode(node);
}
//pop the current tail
private DLinkedNode popTail(){
   DLinkedNode res = tail.pre;
   this.removeNode(res);
   return res;
}

private HashMap<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
private int count;
private int capacity;
private DLinkedNode head, tail;

public LRUCache(int capacity){
  this.count = 0;
  this.capacity = capacity;
  
  head = new DLinkedNode();
  head.pre = null;
  
  tail = new DLinkedNode();
  tail.post = null;
  
  head.post = tail;
  tail.pre = head;
  
}

public int get(int key){
  DLinkedNode node = cache.get(key);
  if(node == null)
     return -1;
  //move the accessed node to the head
  this.moveToHead(node);
  return node.value;
}

public void set(int key, int value){
  DLinkedNode node = cache.get(key);
  if(node == null){
    DLinkedNode newNode = new DLinkedNode();
    newNode.key = key;
    newNode.value = value;
    
    this.cache.put(key, newNode);
    this.addNode(newNode);
    
    ++count;
    
    if(count > capacity){
      //pop the tail
      DLinkedNode tail = this.popTail();
      this.cache.remove(tail.key);
      --count;
    }
  }else{
    //update the value
    node.value = value;
    this.moveToHead(node);
    
  }
}

}

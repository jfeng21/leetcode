class LRUCache_146{
LinkedHashMap<Integer, Integer> map;
int capacity;

public LRUCache(final int capacity){
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

}

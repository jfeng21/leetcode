class TwoSumIII_170{
/*
1. bs + two pointers: add-O(n) for a sorted array, find-O(n) time for two pointers search, O(n) space
2. sort + two pointers: add-O(1), find-O(nlogn) for sorting, O(n)time for two pointers search
3. hashtable: add-O(1), find-O(n), O(n) space---best
*/

private Map<Integer, Integer> map = new HashMap<>();
public void add(int num){
int count = map.containsKey(num)? map.get(num) : 0;
map.put(num, count + 1);
}

public boolean find(int val){
for(Map.Entry<Integer, Integer> entry : map.entrySet()){
int num = entry.getKey();
int y = val - num;
if(map.containsKey(y))
return true;
else if(y == val){
  if(entry.getValue() >= 2)
  return true;
}

}
return false;

}

}

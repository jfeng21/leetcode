class LongestConsecutive_128{
  //using hashMap store element, then check its left and right, if its exist, the length will be sum = left + right + 1
 public int longestConsecutive(int[] nums){
   int res = 0;
   HashMap<Integer, Integer> map = new HashMap<>();
   for(int n : nums){
     if(!map.containsKey(n)){
      int left = (map.containsKey(n - 1))? map.get(n - 1) : 0;
      int right = (map.containsKey(n + 1))? map.get(n + 1) : 0;
      int len = left + right + 1;
      map.put(n, len);
      //keep track of the max len
      res = Math.max(len, res);
      
      //extend the length to the boundary, do nothing if n has no neighbors
      map.put(n - left, len);
      map.put(n + right, len);
      }else{
      continue;  //meet duplicate num, skip
      }
   }
   return res;
 }
}

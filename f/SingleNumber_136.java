class SingleNumber_136{
//using hashset  O(n) space
public int singleNumber(int[] nums){
   Set<Integer> set = new HashSet<>();
   for(int num : nums){
   if(set.contains(num)){
     set.remove(num);
   }else 
      set.add(num);
   }
   return set.iterator().next();

}

//using XOR-ing
public int singleNumber(int[] nums){
 int num = 0;
 for(int x : nums){
    num ^= x;
 }
 return num;

}
}

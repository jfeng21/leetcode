class WordLadder_127{
//bfs, O(n)
public int ladderLength(String start, String end, Set<String> dict){
   if(dict == null) 
     return 0;
   
   HashSet<String> visited = new HashSet<>();
   Queue<String> queue = new LinkedList<>();
   
   queue.offer(start);
   queue.offer(null);   //as a point to while loop case: add level---each time when str == null, level++
   visited.add(start);
   
   int level = 1;
   while(!queue.isEmpty()){
     String str = queue.poll();
      if(str != null){
        //modify str's each character so word distance is 1
         for(int i = 0; i < str.length(); i++){
           char[] chars = str.toCharArray();
           for(char c = 'a'; c < 'z'; c++){
              chars[i] = c;
              String word = new String(chars);
              //found the end word
              if(word.equals(end))
                return level + 1;
              //put it to the queue
              if(dict.contains(word) && !visited.contains(word)){
                 queue.offer(word);
                 visited.add(word);
              }
           }
         }
      
      }else{
         level++;
         if(!queue.isEmpty())
            queue.offer(null);
      
      }
   
   }
   
  return 0;
}



}

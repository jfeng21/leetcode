class WordLadderII_126{
 //using bfs + dfs
 //bfs to find paths--O(n)
 //dfs to find all possible paths--n!, from the end word to start word to reduce time
 public List<List<String>> findLadders(String start, String end, Set<String> dict){
    List<List<String>> res = new ArrayList<List<String>>();
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    Map<String, Integer> dist = new HashMap<String, Integer>();
    
    //add start and end to dict
    dict.add(start);
    dict.add(end);
    
    //bfs
    bfs(map, dist, start, end, dict);
    List<String> path = new ArrayList<String>();
    dfs(map, path, start, end, dist, res);
    return res;
    }
    
    private void bfs(Map<String, List<String>> map,  Map<String, Integer> dist, String start, String end, Set<String> dict){
       Queue<String> queue = new LinkedList<String>();
       //add start to queue, and put that in dist and map
       queue.offer(start);
       dist.put(start, 0);
       for(String s : dict){
         map.put(s, new ArrayList<String>());
       }
       
       while(!queue.isEmpty()){
        String cur = queue.poll();
        List<String> nextList = expand(cur, dict);
        for(String next : nextList){
           //add to map and update dist
           map.get(next).add(cur);  //map: next-->is tranformed from cur
           if(!dist.containsKey(next)){
               dist.put(next, dist.get(cur) + 1);
               //put next word in queue
               queue.offer(next);
           }
        }
       }
    }
    
    private void dfs(Map<String, List<String>> map, List<String> path,  String start, String cur, Map<String, Integer> dist, List<List<String>> res){
      path.add(cur);  //reverse order
      if(cur.equals(start)){
        Collections.reverse(path);
        //add to res
        res.add(new ArrayList<String>(path));
        //reverse back for the next path
        Collections.reverse(path);
      }else{
        for(String next : map.get(cur)){
           if(dist.containsKey(next) && dist.get(cur) == dist.get(next) + 1){
             dfs(map, path, start, next, dist, res);
           }
        }
      }
      path.remove(path.size() - 1);  //backtracking
    }
    
    private List<String> expand(String word, Set<String> dict){
       List<String> res = new ArrayList<String>();
       
       for(int  i = 0; i < word.length(); i++){
         for(char c = 'a'; c <= 'z'; c++){
            if(c != word.charAt(i)){
              String expanded = word.substring(0, i) + c + word.substring(i + 1);
              if(dict.contains(expanded))
                 res.add(expanded);
            }
         }
       }
       return res;
    }
 
 
 }


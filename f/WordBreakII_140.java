class WordBreakII_140{
//dp + dfs

HashMap<String, LinkedList<String>> map = new HashMap<>();  //stores words and splitted words
public List<String> wordBreak(String s, Set<String> dict){
  if(map.containsKey(s))
    return map.get(s);
  LinkedList<String> res = new LinkedList<>();
  //termination condition
  if(s.length() == 0){
     res.add("");
     return res;
  }
  for(String word : dict){
     if(s.startsWith(word)){   //cat
        List<String> rest = wordBreak(s.substring(word.length()), dict);  //sandsdog
        for(String sub : rest){
            res.add(word + (sub.isEmpty()? "" : " ") + sub);
        }
     }
  }
  map.put(s, res);
  return res;
  
}

}

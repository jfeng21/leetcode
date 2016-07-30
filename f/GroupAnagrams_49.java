class GroupAnagrams_49{
   public List<List<String>> groupAnagrams(String[] strs){
     List<List<String>> res = new ArrayList<List<>>();
         if(strs.length == 0 || strs == null)
       return res; 
       
       Map<String, List<String>> map = new HashMap<>();  //map: <sorted chars, words in dict>
       
       for(String s: strs){
          char[] ca = s.toCharArray();
          Arrays.sort(ca);  //!!!!!after sorting, the group anagrams are grouped by same val: sorted chars
          String keyStr = String.valueOf(ca);
          if(!map.containsKey(keyStr)){
             map.put(keyStr, new ArrayList<String>());
           map.get(keyStr).add(s);
          }
       }
       
       for(String key : map.keySet()){
          Collections.sort(map.getKey());
       }
       
       return new ArrayList<List<String>>(map.values());
}
}

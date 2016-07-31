class ValidAnagram_242{
   public boolean isAnagram(String s, String t){
      Map<Character, Integer> map = new HashMap<>();
      
      for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            map.put(c, map.get(c) + 1);
        }else
           map.put(c, 1);
      }
      
      for(int j = 0; j < t.length(); t++){
        char c = s.charAt(j);
        if(map.containsKey(c) && map.get(c) > 0){
            map.put(c, map.get(c) - 1);
        }else
            return false;
      }
      
      //find map values
      for(int val : map.values()){
          if(val != 0)
            return false;
          return true;
      }
   }
}

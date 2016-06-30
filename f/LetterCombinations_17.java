class LetterCombinations_17{
//backtracking, recursive
  public List<String> letterCombinations(String digits){
    List<String> res = new ArrayList<>();
    if(digits == null || digits.length() == 0)
      return res;
      
    String[][] map ={{},{},{"a","c","b"},{"d","e","f"},{"g","h","i"},{"j","k","l"},
    {"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
    String one = "";
    recur(res, one, digits, map, 0);
    return res;
  }
  
  private void recur(List<String> res, String one, String digits, String[][] map, int start){
    if(start >= digits.length()){
      res.add(one);
      return;
    }
    
    int index = digits.charAt(start) - '0';
    String[] current = map[index];
    for(int i = 0; i < current.length; i++){
      one = one + current[i];
      recur(res, one, digits, map, start + 1);
      one = one.substring(0, one.length() - 1);
    }
    
    
  }

}

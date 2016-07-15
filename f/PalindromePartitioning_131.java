class PalindromePartitioning_131{ 
  public List<List<String>> partition(String s){
    List<List<String>> res = new ArrayList<>();
    if(s == null)  return res;
    ArrayList<Stirng> list = new ArrayList<>();
    helper(res, list, 0, s);
    return res;
  }
  
  private void helper(List<List<String>> res, ArrayList list, int pos, String s){
      //termination condition
      if(pos == s.length()){
        res.add(new ArrayList<String>(list));
        return;
      }
      String substr = "";
      for(int i = pos; i < s.length(); i++){
        substr += s.charAt(i);
        if(!isPalindrome(substr))
          continue;
        list.add(substr);
        //backtracking
        helper(res, list, i + 1, s);
        list.remove(list.size() - 1);
      }
  }
  
  private boolean isPalindrome(String s){
     int start = 0, end = s.length() - 1;
     while(start < end){
       if(s.charAt(start) != s.charAt(end)){
         return false;
       }
       start++;
       end--;
     }
     return true;
  
  }


}

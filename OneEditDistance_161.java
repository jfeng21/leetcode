class OneEditDistance_161{
//one pass: O(n) time, O(1) space
  public boolean isOneEditDistance(String s, String t){
     int m = s.length(), n = t.length();
     if(Math.abs(m - n) > 1)
       return false;
       
    for(int i = 0; i < Math.min(m, n); i++){
      if(s.charAt(i) != t.charAt(i)){
        if(m == n)
          return s.substring(i + 1).equals(t.substring(i + 1));  //replace
        else if(m < n)
          return s.substring(i).equals(t.substring(i + 1));    //delete one from t
        else 
          return s.substring(i + 1).equals(t.substring(i));  //delete one from s
      
      }
        
    }
    
    return Math.abs(s.length() - t.length()) == 1;    //append one at the end
  
  }

}

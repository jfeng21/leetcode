class LongestPalindromic_5{
  public String longestPalindrom(String s){
   if(s = null || s.length() == 0)
   return "";
   
   int start = 0, end = 0;
   for(int i = 0; i < s.length(); i++){
      int len1 = expand(s, i, i);    //split in middle
      int len2 = expand(s, i, i + 1);  
      int len = Math.max(len1, len2);
      
      if(len > end - start){
        start = i - (len - i)/2;
        end = i + len/2;
      }
   }
   return s.substring(start, end + 1);
  }
  
  private int expand(String s, int l, int r){
  while(l < r){
    if(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
    l++;
    r--;
    }
    return l - r - 1;
  }
  
  }

}

/*
Given a string "aaabbbcc", compress it, = "a3b3c2" .
Given   that output string's length is always smaller than input string,
you have do it inplace. No extra space
*/

public String compress(String s){
  if(s == null || s.length() == 0)  return null;
  if(s.length() < 2)
     return s;
     
  if(s.length() == 2){
     if(s.charAt(0) == s.charAt(1)){
        return s.charAt(0) + "2";
     }else{
        return s;
     }
  }
  
  for(int i = 0; i < s.length(); i++){
     int c = i + 1;
     while(c < s.length() && s.charAt(c) == s.charAt(i)){
       c++;
     }
     if(c - i != 1){
        s = s.substring(0, i - 1) + (c - i) + s.substring(c);
        i++;
     }
  }
  return s;
     
}

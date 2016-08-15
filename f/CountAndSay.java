class CountAndSay{
  public String countAndSay(int n){
     String oldString = "1";
     while(--n > 0){
       StringBuilder sb = new StringBuilder();
       char[] oldChars = oldString.toCharArray();
       
       for(int i = 0; i < oldChars.length; i++){
          int count = 1;
          while((i + 1) < oldChars.length && oldChars[i] == oldChars[i + 1]){
            count++;
            i++;
          }
          sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
       }
       oldString = sb.toString();
     }
     return oldString;
  }
  //method 2:
  public String countAndSay(int n){
     if(n == 0)
       return null;
    if(n == 1)
      return "1";
      
    String s = countAndSay(n - 1);
    StringBuilder sb = new StringBuilder();
    int len = s.length();
    int count = 0;
    
    for(int i = 0; i < len; i++){
      count++;
      if(i == len - 1 || (i < len - 1 && s.charAt(i) != s.charAt(i + 1))){
        sb.append(count);
        sb.append(s.charAt(i));
        count = 0;
      }
    }
    
    return sb.toString();
  }
  
  //use arraylist to store all sequence
  public String countAndSay2(int n){
      if(n <= 0)
         return "";
      
      ArrayList<String> res = new ArrayList<>();
      res.add("1");
      
      for(int i = 1; i < n; i++){
        res.add(findNext(result.get(i)));
        
      }
      return res.get(n - 1);
  }

  public String findNext(String str){
    String res = "";
    int count = 1;
    for(int i = 0; i < str.length() - 1; i++){
      if(str.charAt(i) != str.charAt(i + 1)){
        res += String.valueOf(count) + str.charAt(i);
        count = 1;
        continue;
      }
      count++;
    }
    res += String.valueOf(count) + str.charAt(str.length() - 1);
    return res;
  }

}

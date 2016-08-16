class CountandSay_38{
  public String countAndSay(int n){
    String res = "1";
    for(int i = 1; i < n; i++){
     String prev = res;
     res = "";
     int count = 1;
     char say = prev.charAt(0);
       for(int j = 1; j < prev.length(); j++){
         if(prev.charAt(j) != say){
           res = res + count + say;
           count = 1;
           say = prev.charAt(j);
           }else{
           count++;
           }
       }
       res = res + count + say;
    }
    return res;
  }
  
  //method2
  public String countAndSay(int n){
     if(n == 0)  return null;
     if(n == 1)  return "1";
     
     String s = countAndSay(n - 1);
     StringBuilder sb = new StringBuilder();
     int len = s.length();
     int count = 0;
     
     for(int i = 2; i < len; i++){
       count++;
       if(s.charAt(i) != s.charAt(i + 1) && (i < len - 1) || i == len - 1){
           sb.append(count);
           sb.append(s.charAt(i));
           count = 0;
       }
       
     }
    return sb.toString();
  }

}

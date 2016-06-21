class ReverseWords_151{
public String reverseWords(String s){
StringBuilder sb = new StringBuilder();
int mark = s.length();
for(int i = s.length() - 1; i >= 0; i--){
   if(s.charAt(i) == ' ')
     mark = i;
  else if(i == 0 || s.charAt(i - 1) ==' '){
      if(sb.length() != 0)
        sb.append(' ');
      sb.append(s.substring(i, mark));
     }
}
return sb.toString();
}


}

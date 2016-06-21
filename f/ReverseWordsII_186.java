class ReverseWordsII_186{
public void reverseWords(char[] s){
//reverse the whole sentence
   reverse(s, 0, s.length);  
//reverse each words back
   for(int i = 0, j = 0; j <= s.length() - 1; j++){
      if(j==s.length || s[j] == ' '){
        reverse(s, i, j);
        i = j + 1;   //move to next word
      }
      
   }

}
private void reverse(char[] s, int start, int end){
for(int i = 0; i < (end - start)/2; i++){
  char temp = s[start + i];
  s[start + i] = s[end - 1 - i];
  s[end - 1 - i] = temp;
}
}

}

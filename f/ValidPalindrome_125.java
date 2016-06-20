class ValidPalindrome_125{
//two pointers: O(n) time, O(1) space
//need to consider if the s is valid
public boolean isPalindrome(String s){
if(s == null || s.length() == 0 || s == "")
  return true;


int i = 0, j = s.length() - 1;
while(i < j){
  while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
  while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
  
  if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))   // to lowercase and NOT Equal for the condition check
     return false;
  i++;
  j--;
}



return true;
}
}

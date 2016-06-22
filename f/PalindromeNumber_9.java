class PalindromeNumber_9{
//method 1: comparing from two ends
public boolean isPalindrome(int x ){
   if(x < 0)
     return false;
  int div = 1;
  while( x / div >= 10){
    div *= 10;
  }
  while(x != 0){
  int l = x / div;
  int r = x % 10;
  if(l != r)
    return false;
  x = (x % div) / 10;
  div /= 100;   //from two sides
  
  }
  return true;
}
//method 2 : reverse int
public boolean isPalindrom(int x){
  if(x < 0 || (x != 0 && x % 10 == 0))
    return false;
  int rev = 0;
  while(x > rev){
     rev = rev * 10 + x % 10;
     x = x / 10;
  }
  return (x == rev || x == rev / 10);
}
}

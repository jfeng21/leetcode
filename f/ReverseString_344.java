class ReverseString_344{
  public String reverseString(String s){
 //stringbuilder
 return new StringBuilder(s).reverse().toString();
 //divid and conquer
 int len = s.length();
 if(len <= 1)
 return s;
 String left = s.substring(0, len/2);
 String right = s.substring(len/2, len);
 return reverseString(right) + reverseString(left);
}

}

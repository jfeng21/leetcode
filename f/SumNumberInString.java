class SumNumberInString{
   public int sum(String s){
      int sum = 0;
      for(char c : a.replaceAll("\\D", "").toCharArray()){
         int digit = c - '0';
         sum += digit;
      }
      return sum;
   }

}

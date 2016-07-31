class DividTwoIntegers_29{

   pubic int divide(int dividend, int divisor){
      //reduce the problem to positive long integer to make it easier
      //use long to avoid integer overflow cases
      int sign = 1;
      if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
          sign = -1;
      long ldividend = Math.abs((long)dividend);
      long ldivisor = Math.abs((long)divisor);
      
      //edge cases
      if(ldivisor == 0)   return Integer.MAX_VALUE;
      if((ldividend == 0) || (ldividend < ldivisor))   return 0;
      
      long lans = ldivide(ldividend, ldivisor);
      
      int ans;
      if(lans > Integer.MAX_VALUE){
        ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }else{
        ans = (int)(sign * lans);
      }
      return ans;
   }
   
   private long ldivide(long ldividend, long ldivisor){
      if(ldividend < ldivisor)  return 0;
      long sum = ldivisor;
      long multiple = 1;
      while(sum + sum) <= ldividend){
        sum += sum;
        multiple += multiple;
      }
      
      return multiple + ldivide(ldividend - sum, ldivisor);
   }

}

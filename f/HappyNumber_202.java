class HappyNumber_202{

   private int squareSum(int n){
     int sum = 0, temp;
     while(n > 0){
        temp = n % 10;
        sum += temp * temp;
        n /= 10;
     }
     return sum;
   }
   
   public boolean isHappy(int n){
       int slow = n, fast = sqaureSum(n);
       
      while(slow != fast){
        slow = squareSum(slow);
        fast = squareSum(fast);
        fast = squareSum(fast);
      }
      if(slow == 1)
        return true;
      else
       return false;
   }

}

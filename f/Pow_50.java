class Pow_50{
  public double myPow(double x, int n){
     if(x == 0 || x == 1 || n == 1)
       return x;
     
   
     
     if(n < 0){
       x = 1 / x;
       n = -n;
     }
     
       if(n == 0)
       return 1;
     
     return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
     
  }

}

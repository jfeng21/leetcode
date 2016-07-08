class PerfectSquare_279{
//dp--O(n^2)
//dp[i] = min(dp[i], dp[j] + dp[k])  (i = j + k) ---> optimize:
//dp[i] = min(dp[i - j*j] + 1, dp[i])

   public int numSquares(int n){
     int[] dp = new int[n + 1];
     //initial as max integer
     for(int i = 1; i <= n; i++){
       dp[i] = Integer.MAX_VALUE;
     }
     
     for(int i = 1; i <= n; i++){
        int sqrt = (int)Math.sqrt(i);
        //check if the num is already a perfect square
          if(sqrt * sqrt == i){
            dp[i] = 1;
            continue;
          }
     
     
        for(int j = 1; j <= sqrt; j++){
          dp[i] = Math.min(dp[i - j*j] + 1, dp[i]);
        
        }
  }
     return dp[n];
   }

}

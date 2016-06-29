class DecodeWays_91{
//similar to climbing stairs but some constrains:
//1. if the number is 1-9, dp[i] += dp[i - 1]
//2. if number is 10-26, dp[i] += dp[i - 2] 
  public int numDecodings(String s){
    if(s== null || s.length() == 0)  return 0;
    int len = s.length();
    //the result of first i digits
    int[] dp = new int[len + 1];
       dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        
    for(int i = 2; i <= len; i++){
     //prev digit should not be 0
       if(s.charAt(i - 1) != '0' )
         dp[i] += dp[i - 1];
       if(i >= 2 && isTwoDigits(s.substring(i - 2, i))){
         dp[i] += dp[i - 2];
       }
    }
    return dp[len]; 
  }
  
  private boolean isTwoDigits(String s){
    int num = Integer.parseInt(s);
    return num >= 10 && num <= 26;
  }
}

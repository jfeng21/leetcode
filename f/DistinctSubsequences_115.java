class DistinctSubsequences_115{
 //dp: if s and t are diff: dp[i][j] = dp[i] [j - 1]
 //if same: dp[i][j] = dp[i - 1][j - 1] + dp[i + 1][j]
   public int numDistinct(String s, String t){
     int n = s.length();
     int m = t.length();
     int[][] dp = new int[m + 1][n +1];
     //initial
     for(int i = 0; i < n; i++){
       dp[0][i] = 1;
     }
     for(int i = 0; i < m; i++){
       for(int j = 0; j < n; j++){
        if(t.charAt(i) == s.charAt(j)){
           dp[i + 1][j + 1] = dp[i][j] + dp[i + 1][j];
       }else{
           dp[i + 1][j + 1] = dp[i + 1][j];
       }
     }
    
   }
return dp[m][n];
}
}

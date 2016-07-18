class EditDistance_72{
/*dp
1. insert a letter, dist = dist[i - 1][j] + 1
2. delete a letter, dist = dist[i][j - 1] + 1
3. replace, dist = 0(replace last word) or dist[i - 1][j - 1] + 1
formular: if words are same: dist[i][j] = dist[i - 1][j - 1]
if words are diff: dist[i][j] = min{dist[i][j - 1], dist[i - 1][j], dist[i - 1][j - 1]} + 1
*/
 
  public int minDistance(String word1, String word2){
     int n = word1.length();
     int m = word2.length();
     //initialize
     int[][] dp = new int[n + 1][m + 1];
     for(int i = 0; i < n + 1; i++){
       dp[i][0] = i;   //delete i times to j(null)
     }
  
     for(int i = 0; i < m + 1; i++){
       dp[0][i] = i;   //delete i times to j(null)
     }
     
     for(int i = 1; i < n + 1; i++){
       for(int j = 1; j < m + 1; j++){
          if(word1.charAt(i - 1) == word2.charAt(j - 1)){
          dp[i][j] = dp[i - 1][j - 1];
          }else{
            // dp[i-1][j-1] : replace word1(i) with word2(j), because word1(0, i-1) == word2(0, j-1);
                // dp[i  ][j-1] : delete word(j)
                // dp[i-1][j  ] : delete word(i), because word1(0, i-1) == word2(0, j)   
             dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
          }
       }
     }
     return dp[n][m];
  }

}

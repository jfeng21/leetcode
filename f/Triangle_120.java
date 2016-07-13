class Triangle_120{
  //dp  time O^2, space O^2
  //bottom up
  public int minimumTotal(List<List<Integer>> triangle){
     int row = triangle.get(triangle.size() - 1).size();
     int col = triangle.size();
     
     //intial dp and last row
     int[][] dp = new int[row][col];
     int c = 0;
     for(Integer n : triangle.get(col - 1)){
        dp[row - 1][c++] = n;
     }
     
     for(int i = row - 2; i >= 0; i--){
       for(int j = 0; j < triangle.get(i).size(); j++){
         dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
       }
     }
     return dp[0][0];
  }

}

class UniquePahtsII_63{
public int uniquePathsWithObstacles(int[][] obstacleGrid){
   if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0)
      return 0;
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
   int[][] paths = new int[m + 1][n + 1];
  
   paths[m - 1][n] = 1;
   for(int r = m - 1; r >= 0; r--){
    for(int c = n - 1; c >= 0; c--){
      paths[r][c] = (obstacleGrid[r][c] == 1) ? 0 : paths[r + 1][c] + paths[r][c + 1];
    }
   }
   
   return paths[0][0];
}

}

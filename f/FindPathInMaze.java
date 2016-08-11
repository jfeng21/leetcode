class FindPathInMaze{
    public int findPathInMaze(int[][] maze){
      if(maze == null || maze.length == 0 || maze[0].length == 0){
         return 0;
      }
      
      if(maze[0][0] == 0){
         return 0;
      }
      
      if(maze[0][0] == 9){
         return 1;
      }
      return dfs(maze, 0, 0) ? 1 : 0;
    
    }
    
    private boolean dfs(int[][] maze, int x, int y){
       if(x < 0 || x >= maze.length || y < 0 || y >= maze[x].length || maze[x][y] == 0){
           return false;
       }
       
       if(maze[x][y] == 9)
          return true;
       else{
         maze[x][y] = 0;
         return dfs(maze, x, y + 1) || dfs(maze, x + 1, y) || dfs(maze, x - 1, y) || dfs(maze, x, y - 1);
       }
    }

}

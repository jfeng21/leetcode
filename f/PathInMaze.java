class PathInMaze{
boolean findPath(List<List<Node>> res, List<Node> path, int[][] board, Node start, Node end, int[] dx, int[] dy, int[][] visited){
  if(start.x >= board.length || start.x < 0 || start.y >= board[0].length)  
     return;
  if(end.x >= board.length || end.x < 0 || end.y >= board[0].length)  
     return;
  if(start.x == end.x && start.y == end.y){
     path.add(start);
     res.add(new ArrayList<>(path));
     return;
  }
  
  for(int i = 0; i < 4; i++){
    if(visted[start.x, start.y] == 1)
       continue;
    if(board[start.x][start.y] == 1)
       break;
    path.add(new Node(start.x, start.y));
    visited[start.x, start.y] = 1;
    findPath(res, path, board, new Node(start.x + dx[i], start.y + dx[i]), end, dx, dy, visit);
    visited[start.x, start.y] = 0;
    path.remove(path.size() - 1);
  }

}

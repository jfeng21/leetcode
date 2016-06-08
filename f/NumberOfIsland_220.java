class Solution{
public int numberOfIsland(char[][] grid){
if(grid == null || grid.length == 0)
return 0;

int row = grid.length, col = grid[0].length, count = 0;

for(int i = 0; i < row; i++){
for(int j = 0; j < col; j++){
if(grid[i][j] == '1'){
count++;
DFS(grid, i, j);
}
}
}

}

private void DFS(char[][] grid, int i, int j){
if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length)
return;

if(grid[i][j] == '1'){
grid[i][j] = '2';
DFS(grid, i+1, j);
DFS(grid, i-1, j);
DFS(grid, i, j+1);
DFS(grid, i, j-1);
}
}
}

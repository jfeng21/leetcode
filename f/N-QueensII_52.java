public class N-QueensII_52{
  public static int sum;
  public int totalNQueens(int n){
    sum = 0;
    int[] usedCols = new int[n];
    helper(usedCols, 0);
    return sum;
  }
  
  private void helper(int[] usedCols, int row){
    int n = usedCols.length;
    if(row == n){
      sum++;
      return;
    }
    for(int i = 0; i < n; i++){
      if(isValid(usedCols, row, i)){
       usedCols[row] = i;
       helper(usedCols, row + 1);
     
    }
    }
  }
  
  private boolean isValid(int[] usedCols, int row, int col){
     for(int i = 0; i < row; i++){
       if(usedCol[i] == col)
         return false;
       if((row - i) == Math.abs(col - usedCols[i]))
         return false;
     }
     return true;
  }
  

}

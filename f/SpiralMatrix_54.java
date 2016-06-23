class SpiralMatrix_54{
public List<Integer> spiralOrder(int[][] matrix){
List<Integer> res = new ArrayList<Integer>();
if(matrix == null || matrix.length == 0)
  return res;

int rowBegin = 0;
int rowEnd = matrix.length - 1;
int colBegin = 0;
int colEnd = matrix[0].length - 1;

while(rowBegin <= rowEnd && colBegin <= colEnd){

  //traverse right
  for(int r = colBegin; r <= colEnd; r++){
   res.add(matrix[rowBegin][r]);
  }
  rowBegin++;
  
  //traverse down
  for(int d = rowBegin; d <= rowEnd; d++){
    res.add(matrix[d][colEnd]);
  }
  colEnd--;
  
  //traverse left  !!!!check condition
  if(rowBegin <= rowEnd){
  for(int l = colEnd; l >= colBegin; l--){
    res.add(matrix[rowEnd][l]);
  }
  }
  rowEnd--;
  
  //traverse up    !!!!check condition
  if(colBegin <= colEnd){
  for(int u = rowEnd; u >= rowBegin; u--){
    res.add(matrix[u][colBegin]);
  }
  }
  colBegin++;
  

}
return res;
}

}

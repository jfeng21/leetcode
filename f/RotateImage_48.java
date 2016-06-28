class RotateImage_48{
   public void rotate(int[][] m){
     //first transpot the matrix by swapping matrix[i][j] and matrix[j][i]
      for(int i = 0; i < m.length; i++){
        for(int j = i; j < m[0].length; j++){
         // int temp = 0;
          int temp = m[i][j];
          m[i][j] = m[j][i];
          m[j][i] = temp;
        }
      }
     //then flip the matrix horizontally by swap(matrix[i][j], matrix[i][matrix.length - 1])
     for(int i = 0; i < m.length; i++){
      for(int j = 0; j < m.length / 2; j++){
        int temp = m[i][j];
        m[i][j] = m[i][m.length - 1 - j];
        m[i][m.length - 1 - j] = temp;
        
        
      }
     }
   
   }
}

class SetMatrixZeroes_73{
  public void setZeroes(int[][] matrix){
    boolean fr = false, fc = false;  //set first row and col as false
    for(int i = 0; i < matrix.length; i++){
     for(int j = 0; j < matrix[0].length; j++){
        //check if it is first row or col, if yes, go to fr func()
        if(matrix[i][j] == 0){
          if(i == 0)   fr = true;
          if(j == 0)   fc = true;
          matrix[i][0] = 0;
        matrix[0][j] = 0;
        }
     }
    
    }
    
    for(int i = 1; i < matrix.length; i++){
     for(int j = 1; j < matrix[0].length; j++){
         if(matrix[i][0] == 0 || matrix[0][j] == 0)
         matrix[i][j] = 0;  //mark it is will be set to zeros later
     }
     }
    //check first row and cols
    if(fr){
      for(int j = 0; j < matrix[0].length; j++)
        matrix[0][j] = 0;
    }
    
     if(fc){
      for(int i = 0; i < matrix.length; i++)
        matrix[i][0] = 0;
    }
  

}
}

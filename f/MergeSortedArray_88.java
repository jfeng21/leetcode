class MergeSortedArray_88{
//start from end
  public void merge(int[] A, int m, int[] B, int n){
    int i = m - 1, j = n - 1, index = m + n - 1;
    
    while(i >= 0 && j >= 0){
      if(A[i] >= B[j])
         A[index--] = A[i--];
      else
         A[index--] = B[j--];
    }
    
    while(i >= 0){
     A[index--] = A[i--];
    }
    while(j >= 0){
     A[index--] = B[j--];
    }
  
  }

}

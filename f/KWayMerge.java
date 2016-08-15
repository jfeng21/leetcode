class KWayMerge{
   public int[] merge(int[][] arr){
      int k = arr.length;
      int n = arr[0].length;
      
      int[] curPos = new int[k];
      int[] merged = new int[k * n];
      int p = 0;
      
      while(p < k * n){
         int min = Integer.MAX_VALUE;
         int minPos = -1;
         
         for(int i = 0; i < k; i++){
            if(curPos[i] < n){
               if(arr[i][curPos[i]] < min){
                  min = arr[i][curPos[i]];
                  minPos = i;
               }
            }
         }
         curPos[minPos]++;
         merged[p++] = min;
      }
      return merged;
      }

}

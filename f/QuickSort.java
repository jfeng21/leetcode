class QuickSort{
    private int[] nums;
    private int len;
   public void sort(int[] input){
       if(input == null || input.length == 0)   return;
       this.nums = input;
       len = input.length;
       quickSort(0, len - 1);
   }
   
   private void quickSort(int low, int high){
     int i = low, j = high;
     int pivot = input[low + (high - low) / 2];
     
     while(i <= j){
       while(input[i] < pivot)
           i++;
       while(input[j] > pivot)
          j--;
          
       if(i <= j){
          exchange(i, j);
          i++;
          j--;
          }
     }
      //recursion
   if(low < j)
      quickSort(low, j);
   if(i < high)
       quickSort(i, high);
       
   }
   
   private void exchange(int i, int j){
     int temp = input[i];
    input[i]= input[j];
     input[j] = temp;
   }
   
  
   
   

}

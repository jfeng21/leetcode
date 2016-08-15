class InPlace_Merge{
   public void merge(int[] x, int first, int last){
    int left = first;
    int mid = (last - first) / 2;
    int right = mid + 1;
    if(x[mid].compareTo(x[right]) <= 0)
       left++;
    else{
       int temp = x[left];
       System.arraycopy(x, left, x, left + 1, right - left);
       x[left] = temp;
       left++; 
       mid++;
       right++;
    }
    
   }


}

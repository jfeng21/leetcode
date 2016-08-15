class CountingSort{
  private static final int MAX_RANGE = 1000000;
  
  public static void sort(int[] arr){
     int len = arr.length;
     if(len == 0)  return;
     
     int max = arr[0], min = arr[0];
     for(int i = 1; i < len; i++){
        if(arr[i] > max)
          max = arr[i];
        if(arr[i] < min)
          min = arr[i];
     }
     int range = max - min + 1;
     
     if(range > MAX_RANGE)
       return;
     
     int[] count = new int[range];
     for(int i = 0; i < len; i++){
        count[arr[i] - min]++;
     }
     //modify positions
     for(int i = 1; i < range; i++)
       count[i] += count[i - 1];
       
     int j = 0;
     for(int i = 0; i < range; i++){
       while(j < count[i])
          arr[j++] = i + min;
     }
     
  }

}

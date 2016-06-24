class MaxProduct_152{
  public int maxProduct(int[] a){
    if(a == null || a.length == 0)
      return 0;
      
    int res = a[0], min = a[0], max = a[0];
      for(int i = 1; i < a.length; i++){
        if(a[i] >= 0){
           max = Math.max(a[i], a[i] * max);
           min = Math.min(a[i], a[i] * min);
        
        }else{
           int temp = max;    //store current max
           max = Math.max(a[i], a[i] * min);
           min = Math.min(a[i], a[i] * temp );
        
        }
       res = Math.max(res, max);
      }
      return res;
 
  }
 
}

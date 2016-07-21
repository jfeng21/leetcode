class BalancedIndex{
 /*
    given an array, find the index and the sum of left and right are equal, if not, return the closest
    */
    public static int index(int[] array){
        int leftsum = 0 ;
        int rightsum = 0;
        int close = 0;
        int start = 0;
        int end = array.length - 1;
        while(start < end){
          
           if(leftsum < rightsum){
              leftsum += array[start++];
           }else{
              rightsum +=array[end--];
           }
           close = Math.abs(Math.min(leftsum - rightsum, close));
           
        }
        
            return close == 0 ? start : close;
        
    }
    
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,5};
       System.out.println(index(array));
    }
    
}

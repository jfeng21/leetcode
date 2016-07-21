class MaxLenOfSubarray{
  
   static int  maxlen = 0;
    static int maxLength(int[] a, int k) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(a, k, list, 0);
        return maxlen;

    }
   private static void helper(int[] a, int k, ArrayList<Integer> list, int pos){
       //termination
       if(k >= 0){
          int len = list.size();
           maxlen = Math.max(len, maxlen);
       }
       
       for(int i = pos; i < a.length; i++){
           if(a[i] > k)
               break;
           list.add(a[i]);
           helper(a, k - a[i], list, i + 1);
           list.remove(list.size() - 1);
           
       }
       
   }
    public static void main(String[] args) {
        int[] max = {1,2,3};
        System.out.println(maxLength(max, 4));
    }
    
}




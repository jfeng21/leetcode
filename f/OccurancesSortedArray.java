class OccurancesSortedArray{
      public int Occurance(String[] array, String x){
           Map<String, Integer> map = new HashMap<String, Integer>();
           for(int i = 0; i < array.length; i++){
             string word = array.charAt(i);
             if(!map.containsKey(word)){
                map.put(word, 1);
             }else{
                map.put(word, map.get(word) + 1);
             }
           }
           return map.get(x);
      }
      
      //if print indexes for values, using bs
      public void PrintIndicesForValue(int[] nums, int target){
           int start = -1;
           int low = 0, high = nums.length - 1;
           //get the start of the target num
           if(low <= high){
              int mid = low + (high - low) / 2;
              if(nums[mid] < target){
                 low = mid + 1;
              }else(nums[mid] == target){
                 start = mid;
                 high = mid - 1;
              }else{
                 high = mid - 1;
              }
           }
           
           //get the end of the target num
           int end = -1;
          int low = 0, high = nums.length - 1;
          while(low <= high){
             int mid = low + (high - low) / 2;
             if(nums[mid] > target){
                high = mid - 1;
             }else if(nums[mid] == target){
                end = mid;
                low = mid + 1;
             }else{
                low = mid + 1;
             }
          }
          
          if(start != -1 && end != -1){
             for(int i = 0; i + start <= end; i++){
                if(i > 0){
                   System.out.print(',');
                }
                System.out.print(i + start);
             }
          }
           
      }


}

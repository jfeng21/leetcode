class RemoveDuplicatesFromArray_26{
   public int removeDuplicates(int[] nums){
      int i = 0, n = nums.length;
      if(n = 0)  return 0;
      
      for(int j = 1; j < nums.length; j++){
         if(nums[i] != nums[j]){
           i++;
           nums[i] = nums[j];
         }
      }
      return i + 1;
   }

}

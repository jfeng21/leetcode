class RemoveDuplicatesFromArray_26{
   public int removeDuplicates(int[] nums){
      int i = 0, n = nums.length;
      if(n = 0)  return 0;
     
       for(int j = 1; j < n; j++){
          //if nums[i] == nums[j], move j to next element, then replace duplicated nums[i] with nums[j]
          if(nums[j] != nums[i]){
             i++;
             nums[i] = nums[j];
          }
          
       }
       
    return i + 1;   //since i starts from 0
}
}

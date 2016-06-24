class SearchInserchPosition_35{
pubic int searchInsert(int[] nums, int target){
   if(nums == null || nums.length == 0)
     return -1;
     
   int lo = 0, hi = nums.length - 1;
   while(lo < hi){
    int mid = lo + (hi - lo)/ 2;
    if(nums[mid] < target){
       lo = mid + 1;
    }else{
       hi = mid;  //important!!!!!
    }
   }
   return (nums[lo] < target) ? lo + 1 : lo;   //after ? before lo
}

}

class FindMinInArray_154{
  public int findMin(int[] nums){
    if(nums == null || nums.length == 0)
      return -1;
    int lo = 0, hi = nums.length - 1;
    while(lo < hi && nums[lo] >= nums[hi]){
      int mid = lo + (hi - lo)/2;
       if(nums[mid] > nums[hi])
         lo = mid + 1;
       else if(nums[mid] < nums[hi])
         hi = mid;
       else 
         lo = lo + 1;
    
    }
    return nums[lo];
  
  }

}

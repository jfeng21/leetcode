class JumpGame_55{
   //dp
   //state: f[i]  can jump to i, f[j] + j >= i
   //initialize: f[0] = true
   //last jump--res f[n - 1]
   public boolean canJump(int[] nums){
      int last = nums.length - 1;
      int maxJump = nums[0];
      
      for(int i = 0; i <= maxJump; i++){
        maxJump = Math.max(maxJump, nums[i] + i);
        if(maxJump >= last)  return true;
      }
      return false;
   }
   
   //greedy
   if(nums == null || nums.length == 0)  return false;
   int furthest = nums[0];
   for(int i = 1; i < nums.length; i++){
     if(i <= furthest && nums[i] + i >= furthes){
        furthest = nums[i] + i;
     }
   }
   return furthest >= nums.length - 1;

}

class JumpGame_55{
  public boolean canJump(int[] nums){
    int maxIndex = nums.length - 1;
    int maxJump = nums[0];
    for(int i = 0; i <= maxJump; i++){
      maxJump = Math.max(maxJump, nums[i] + i);
      if(maxJump >= maxIndex)  return true;
      
    }
    return false;
  }

}

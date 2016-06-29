class HouseRobber_198{
//dp:  O(n):   dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
   public int rob(int[] nums){
      if(nums.length == 0)   return 0;
      int[] dp = new int[nums.length + 1];
      dp[0] = 0;  //rob no house
      dp[1] = nums[0];   //rob one house
      
      for(int i = 2; i <= nums.length; i++){
        dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
      }
      return dp[nums.length];
   
   }
   
//dp: O(1)
   public int rob(int[] nums){
      if(nums.length == 0)  return 0;
      int preMax = 0;
      int curMax = 0;
      for(int i = 0; i < nums.length; i++){
        int temp = curMax;
        curMax = Math.max(preMax + nums[i], curMax);
        preMax = temp;
       }
      return curMax;
   }

}

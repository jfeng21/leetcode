class HouseRobberII_213{
//dp, rob either from 1 to n - 1, or from 0 to n -2
   public int rob(int[] nums){
     if(nums.length == 0)  return 0;
     if(nums.length == 1)  return nums[0];
     
     return Math.max(robBetween(nums, 0, n - 2), robBetween(nums, 1, n - 1));
   }
   
   public int robBetween(int[] nums, int lo, int hi){
     int preMax = 0;
     int curMax = nums[lo];
     for(int i = lo + 1; i <= hi; i++){
       int temp = curMax;
       curMax = Math.max(preMax + nums[i], curMax);
       preMax = temp;
     }
     return curMax;
   }

}

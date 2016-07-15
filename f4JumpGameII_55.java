class JumpGameII_45{
   //greedy
   //maintain a range and keep updating end to max of nums[i] + i, and set it as end, new start will be end + 1
   //loop through until end > len
   public int jump(int[] nums){
    if(nums == null || nums.length == 0)  return -1;
    int n = nums.length - 1;
   int start = 0, end = 0, jumps = 0;
   while(end < n){
     jumps++;
     int furthest = end;
     for(int i = start; i <= end; i++){
       if(nums[i] + i > furthest)
          furthest = nums[i] + i;
     }
     start = end + 1;
     end = furthest;
   }
   return jumps;
   }
   
   //dp, TLE
   public int jump(int[] A){
     int[] dp = new int[A.length];
     dp[0] = 0;
     for(int i = 1; i < A.length; i++){
       dp[i] = Integer.MAX_VALUE;
       for(int j = 0; j <i; j++){
       if(dp[i] != Integer.MAX_VALUE && dp[j] + j >= i){
         dp[i] = dp[j] + 1;
         break;
       }
       }
     }
     return dp[A.length - 1];
   }
   
   

}

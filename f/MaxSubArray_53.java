class MaxSubArray_53{
 //dp
 public int maxSubArray(int[] nums){
   if(nums == null || nums.length == 0)
     return 0;
   int[] sum = new int[nums.length];
   sum[0] = nums[0];
   int max = sum[0];
   
   for(int i = 1; i < nums.length; i++){
     sum[i] = Math.max(nums[i], nums[i] + sum[i - 1]);
     max = Math.max(max, sum[i]);
   }
   return max;
 }

}

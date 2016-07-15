class LongestIncreasingSubsequence_300{
//dp. O(n)
//state: a[i]--prev i, ending with i's LIS
//func: a[i] = max{a[j] + 1}, j < i && a[j] <= a[i]
//initialize: f[0...n-1] = 1
//ans: max(f[0...n-1])
  public int lengthOfLIS(int[] nums){
      if(nums.length == 0)  return 0;
      int[] a = new int[nums.length];
      int max = 0;
      for(int i = 0; i < nums.length; i++){
        a[i] = 1;  //initialize, longest subsequence at least one
        for(int j = 0; j < i; j++){
          if(nums[i] > nums[j]){  
             a[i] = a[i] > a[j] + 1 ? a[i] : a[j] + 1;
          }
        }
        if(a[i] > max)
           max = a[i];
      }
    return max;
  }

}

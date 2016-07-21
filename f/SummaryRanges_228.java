class SummaryRanges_228{
  public List<String> summaryRanges(int[] nums){
      List<String> res = new ArrayList<String>();
      for(int i, j = 0; j < nums.length; j++){
          i = j;  //j track range nums
         while(j + 1 < nums.length && nums[j + 1] == nums[j] + 1)
             j++;
         //put range into list
         if(i == j)
           res.add(nums[i] + "");
         else
           res.add(nums[i] + "->" + nums[j]);
      }
      return res;
  }

}

class SubsetsII_90{
  public List<List<Integer>> subsetsWithDup(int[] nums){
   List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(nums == null || nums.length == 0)
      return res;
   ArrayList<Integer> list = new ArrayList<>();
   Arrays.sort(nums);
   helper(res, list, nums, 0);
   return res;
  
  }
  
  private void helper(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int pos){
    res.add(new ArrrayList<>(list));
     for(int i = pos; i < nums.length; i++){
       if(i != pos && nums[i] == nums[i - 1])  //has dup, and skip one pos
         continue;
      list.add(nums[i]);
      helper(res, list, nums, i + 1);
      list.remove(list.size() - 1);
     
     }
  }

}

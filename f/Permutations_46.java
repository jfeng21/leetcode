class Permutations_48{
  public List<List<Integer>> permute(int[] nums){
    List<List<Integer>>  res = new ArrayList<List<Integer>>();
       if(nums == null || nums.length == 0)
         return res;
     ArrayList<Integer> list = new ArrayList<Integer>();
    helper(res, list, nums);
    return res;
  
  }
  
 private void helper(List<List<Integer>> res, ArrayList list, int[] nums){
      //termination condition
      if(list.size() == nums.length){
        res.add(new ArrayList<Integer>(list));
        return;
      }
      
       for(int i = 0; i < nums.length; i++){
         //check duplicate, continue till find new element
         if(list.contains(nums[i]))
           continue;
         //before backtracking, add to list
         list.add(nums[i]);
         helper(res, list, nums);
         list.remove(list.size() - 1);
         
       }
 
 }

}

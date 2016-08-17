class PermutationsII_47{
  public List<List<Integer>> permutateUnique(int[] nums){
   List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(nums == null || nums.length == 0)
      return res;
   ArrayList<Integer> list = new ArrayList<>();
   int[] visited = new int[nums.length];
   Arrays.sort(nums);
  helper(res, list, nums,visited);
  return res;
  
  
  }
  
  private void helper(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int[] visited){
   if(list.size() == nums.length){
     res.add(new ArrayList<>(list));
     return;
     }
   for(int i = 0; i < nums.length; i++){
     if(visited[i] == 1 ||i != 0 && (nums[i] == nums[i - 1] && visited[i - 1] == 0))
         continue;
     visited[i] = 1;  //if duplicated num, just keep 1
    list.add(nums[i]);
    helper(res, list, nums,visited);
    list.remove(list.size() - 1);
    visited[i] = 0;
   }
  
  
  }
}

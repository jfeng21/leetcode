class CombinationSumII_40{
  private List<List<Integer>> res;
  public List<List<Integer>> combinationSum2(int[] candidates, int target){
    res = new ArrayList<List<Integer>>();
    ArrayList<Integer> list = new ArrayList<>();
    if(candidates == null || candidates.length == 0)
      return res;
    Arrays.sort(candidates);
    helper(candidates, list, target, 0);
    return res;
  }
  
  private void helper(int[] candidates, ArrayList list, int sum, int pos){
     //termination condition
     if(sum == 0)
       res.add(new ArrayList<Integer>(list));
      
     if(pos >= candidates.length || sum < 0)
       return;
       
     int prev = -1;
     for(int i = pos; i < candidates.length; i++){
       if(candidates[i] != prev){
         list.add(candidates[i]);
         helper(candidates, list, sum - candidates[i], i + 1);
         prev = candidates[i];
         list.remove(list.size() - 1);
       }
     }
  }
  
  

}

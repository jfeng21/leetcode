class CombinationSum_39{
  public List<List<Integer>> combinationSum(int[] candidates, int target){
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    ArrayList<Integer> list = new ArrayList<>();
    Arrays.sort(candidates);
    
    if(candidates == null || candidates.length == 0)
      return res;
    
    helper(candidates, res, list, target, 0);
    return res;
  }
  
  private void helper(int[] candidates, List<List<Integer>> res, ArrayList list, int target, int pos){
    //termination condition
    if(target == 0){
      res.add(new ArrayList<>(list));
      return;
    }
    
    int prev = -1;  //check if dup element
    for(int i = pos; i < candidates.length; i++){
       if(candidates[i] > target)
          break;
       if(prev != -1 && prev == candidates[i])  //if prev added element exists, continue
         continue;
        
       list.add(candidates[i]);
       helper(candidates, res, list, target - candidates[i], i);
       list.remove(list.size() - 1);
       //updates candidates
       prev = candidates[i];
    }
  
  
  }

}

class CombinationSumIII_216{
//backtracking
public List<List<Integer>> combinationSum3(int k, int n){
   List<List<Integer>> res = new ArrayList<List<Integer>>();
   ArrayList<Integer> list = new ArrayList<>();
   if(k == 0 || n == 0)
     return res;
   helper(res, list, k, n, 1);
   return res;
}

private void helper(List<List<Integer>> res, ArrayList<Integer> list, int k, int n, int start){
   //termination condition
   if(list.size() == k && n == 0){
    res.add(new ArrayList<>(list));
    return;
    }
    
  for(int i = start; i <= 9; i++){
    list.add(i);
    helper(res, list, k, n - i, i + 1);
    list.remove(list.size() - 1);
  }
    
    
}

   

}

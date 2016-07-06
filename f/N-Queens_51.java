class N-Queens_51{
  public List<List<String>> solveNQueens(int n){
    List<List<String>> res = new ArrayList<List<String>>();
    dfs(new int[n], 0, n, res);
    return res;
  }
  
  private void dfs(int[] pos, int step, int n, List<List<String>> res){
    if(step == n){
      ArrayList<String> ls = printboard(pos, n);
      res.add(new ArrayList<String>(ls));
      return;
    }
    for(int i = 0; i < n; i++){
      pos[step] = i;
      if(isValid(pos, step))
         dfs(pos, step + 1, n, res);
    }
  }
  
  private boolean isValid(int[] pos, int step){
    for(int i = 0; i < step; i++){
      if(pos[i] == pos[step] || (Math.abs(pos[i] - pos[step])) == (step - i)){   //check cols and antitriangle
        return false;
      }
    }
    return true;
  }
  
  private ArrayList<String> printboard(int[] pos, int n){
    ArrayList<String> res = new ArrayList<>();
    for(int i = 0; i < n; i++){
      StringBuilder sb = new StringBuilder();
      for(int j = 0; j < n - 1; j++){
         sb.append('.');
      }
      sb.insert(pos[i], 'Q');
      res.add(sb.toString());
    }
    return res;
  
  }
  

}

class MissingRanges_163{
public List<String> findMissingRanges(int[] nums, int lower, int upper){
  List<String> res = new ArrayList<>();
  int next = lower;   //tracking lower bound
  
  for(int i = 0; i < nums.length; i++){
    if(num[i] < lower)
      continue;
    if(num[i] == next){
      next++;
      continue;
      }
    res.add(getRange(next, nums[i] - 1));
  }
    if(next <= upper)
      res.add(getRange(next, upper));
    return res;
  
}

private String getRange(int lower, int upper){
return (lower == upper)? String.valueOf(lower) : String.format("d%->d%", lower, upper);
}


}

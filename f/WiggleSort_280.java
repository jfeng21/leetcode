class WiggleSort_28{
//sort and swap---O(nlogn)
  public void wiggleSort(int[] nums){
    Arrays.sort(nums);
    for(int i = 1; i < nums.length - 1; i += 2){
      swap(nums, i);
    }
  
  }
  private void swap(int[] nums, int i){
    int tmp = nums[i];
    nums[i] = nums[i + 1];
    nums[i + 1] = tmp;
  }
  
  //odd and even ---o(n)
  //if odd: nums[i] <= nums[i - 1], if even: nums[i] >= nums[i - 1]
  public void wiggleSort(int[] nums){
    int n = nums.length;
    for(int i = 1; i < n ; i++){
      if(i % 2 == 0 && nums[i] >= nums[i - 1] || i % 2 == 1 && nums[i] <= nums[i - 1])
        swap(nums, i);
    }
  }
  
  private void swap(int[] nums, int i){
    int tmp = nums[i];
    nums[i] = nums[i - 1];
    nums[i- 1] = tmp;
  }

}

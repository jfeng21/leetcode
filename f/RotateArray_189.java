class RotateArray_189{
//reverse whole, then reverse left, right
  public void rotate(int[] nums, int k){
     k %= nums.length;  //incase k is larger than length
     
     reverse(nums, 0, nums.length - 1);
     reverse(nums, 0, k - 1);
     reverse(nums, k, nums.length - 1);
     
  }
  private void reverse(int[] nums, int start, int end){
     while(start < end){
       int temp = nums[start];
       nums[start] = nums[end];
       nums[end] = temp;
       start++;
       end--;
     }
  }

}

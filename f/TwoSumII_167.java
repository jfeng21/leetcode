class TwoSumII_167{
//two pointer, O(n) time, O(1) space
public int[] twoSum(int[] nums, int target){
int i = 0, j = nums.length - 1;

while(i < j){
    if(nums[i] + nums[j] > target)
      j--;
    else if(nums[i] + nums[j] < target)
      i++;
    else
      return new int[]{i + 1, j + 1};  //attention
}

}

//binary search, O(nlogn) time, O(1) space
public int[] twoSum(int[] nums, int target){
for(int i = 0; i < nums.length; i++){
int key = target - nums[i];
int res = bs(nums, key, i+1);  //start from i + 1 since nums[i] is already selected, and search for another element
if(res != -1)
   return new int[]{i + 1, res + 1};
}
throw new IllegalArgumentException("No solution");
}
private int bs(int[] nums, int key, int start){
int l = start, r = nums.length - 1;

while(l < r){
int m = start + (l - r)/2;   //m needs to be defined in the loop!!!!
   if(nums[m] < key)
     l = m + 1;
  else if(nums[m] > key)
     r = m - 1;
  else
    return m;
}
return (l == r && nums[l] == key) ? l : -1;

}
}




}

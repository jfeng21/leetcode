class TwoSum_1{
public int[] twoSum(int[] nums, int target){
Map<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < nums.length; i++){
int x = nums[i];
if(map.contains(target - x)){
    return new int[]{
    map.get(target - x), i
    };
}
map.put(x, i);
}

}
throw new IllegalArgumentException("No Solution");

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subsets_78{
public List<List<Integer>> subsets(int[] nums){
List<List<Integer>> res = new ArrayList<List<Integer>>();
if(nums.length == 0 || nums == null)
    return res;
ArrayList<Integer> list = new ArrayList<Integer>();
Arrays.sort(nums);

subsetHelper(res, list, nums, 0);
return res;

}

private void subsetHelper(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int pos){

    res.add(new ArrayList<Integer>(list));
for(int i = pos; i < nums.length; i++){
    list.add(nums[i]);
    subsetHelper(res, list, nums, i+1);
    list.remove(list.size() - 1);

}

}

public static void main(String[] args){
    int[] nums = {1,2,3};
    Subsets_78 sub = new Subsets_78();
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    res = sub.subsets(nums);
    System.out.println(result);
}

}

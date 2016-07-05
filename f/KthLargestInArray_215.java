class KthLargestInArray_215{
  //heap: klogn
  public int findKthLargest(int[] nums, int k){
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    for(int num : nums){
       if(queue.size() < k)
         queue.add(num);
      else if(queue.peek < num){
        queue.remove();
        queue.add(num);
      }
      
    }
    return queue.peek();
  }

}

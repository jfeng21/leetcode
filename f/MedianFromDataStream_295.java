class MedianFromDataStream_295{ 
  PriorityQueue<Integer> min = new PriorityQueue<Integer>();
  PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
  public void addNum(int num){
     max.offer(num);   //to the left
     min.offer(max.poll());   //to the right
     if(max.size() < min.size()){
        max.offer(min.poll());
     }
  }
  public double findMedian(){
     if(max.size() == min.size())
       return (max.peek() + min.peek()) / 2.0;
       else
       return max.peek();
  
  }
  

}

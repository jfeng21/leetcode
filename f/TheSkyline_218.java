class TheSkyline_218{
//compare current max height with prev, if different, add current position together with this new max height
//at the same time, update previous max height to current max height
//1. collect all [start, -height] and [end, height] for every building
//2. sort it, firstly based on the first value, then use the second to break ties
//3. viist all point, when points have same value, higher height will shadow the lower ones
   public List<int[]> getSkyline(int[][] buildings){
     List<int[]> result = new ArrayList<>();
     List<int[]> height = new ArrayList<>();
     for(int[] b : buildings){
       //start point has negative value
       height.add(new int[]{b[0], -b[2]});
       //end point has positive value
       height.add(new int[]{b[1], b[2]});
     }
     
     //sort height based on first value, if necessary, use second
     Collections.sort(height, (a, b) ->{ 
        if(a[0] != b[0])
          return a[0] - b[0];
        else
          return a[1] - b[1];
     });
     
     //use maxHeap to store possible heights
     Queue<Integer> queue = new PriorityQueue<>((a, b)->(b - a));  //if b > a, add to queue with larger in front
     //initialize
     queue.offer(0);
     //pre max = 0
     int prev = 0;
     //visit all points in order
     for(int[] h : height){
       if(h[1] < 0)
         queue.offer(-h[1]);  //a start point, add height
       else
         queue.remove(h[1]);   //end point, remove height
       int cur = queue.peek();   //cur max height
       //compare cur max with pre max, update result and pre if necessary
       if(prev != cur ){
          result.add(new int[]{h[0], cur});
          prev = cur;
       }
     }
     return result;
   }
}

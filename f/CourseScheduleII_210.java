class CourseScheduleII_210{
//bfs, topological sorting
  public int[] findOrder(int numCourses, int[][] prereq){
    Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    int[] res = new int[numCourses];
    Queue<Integer> queue = new LinkedList<Integer>();
    int[] outdegree = new int[numCourses];
    int size = 0;
    int count = numCourses;
    //ini map
    for(int i = 0; i < numCourses; i++){
      map.put(i, new ArrayList<Integer>());
    }
    //fill map and calculate outdegree
    for(int i = 0; i < prereq.length; i++){
      map.get(prereq[i][1]).add(prereq[i][0]);
      outdegree[prereq[i][0]]++;
    }
    //add outdegree == 0 to queue
    for(int i = 0; i < numCourses; i++){
      if(outdegree[i] == 0)
        queue.offer(i);
    }
    //poll nodes from queue
    while(!queue.isEmpty()){
      int current = queue.poll();
      //check its neighbors
      res[size++] = current;
      for(int i : map.get(current)){
         if(--outdegree[i] == 0)
           queue.offer(i);
      }
      count--;
    }
    
    if(count == 0)  return res;
    else return new int[0];
    
  }

}

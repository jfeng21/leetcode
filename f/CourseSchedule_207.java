//topological sorting, find if the directed graph has cycle
//add in degree == 1 to queue, and traverse the queue to check cycle

class CourseSchedule_207{
  public boolean canFinish(int numCourses, int[][] prereq){
    //ini course nodes
    Course[] courses = new Course[numCourses];
    for(int i = 0; i < courses.length; i++){
      courses[i] = new Course();
    }
    //add edges
    for(int[] edge : prereq){
      //edges[0] inDegree depends on edges[1] outDegree
      Course in = courses[edge[0]];
      Course out = courses[edge[1]];
      
      if(!out.outNeighbors.contains(in)){
         in.inDegree++;
         //add edge
         out.outNeighbors.add(in);
      }
    }
    
    Queue<Course> zeroInDegree = new LinkedList<Course>();
    for(Course course : courses){
      //move the indegree == 0 nodes and add to queue
      if(course.inDegree == 0)
         zeroInDegree.offer(course);
    }
    
    while(!zeroInDegree.isEmpty()){
      Course course = zeroInDegree.poll();
      for(Course outNeighbor : course.outNeighbors){
        outNeighbor.inDegree--;
        if(outNeighbor.inDegree == 0){
          zeroInDegree.offer(outNeighbor);
        }
      }
      course.outNeighbors.clear();
    }
    
    //check if exists cycle
    for(Course course : courses){
      if(course.inDegree > 0)
       return false;
    }
    return true;
  }


}

class Course{
  int inDegree;  //is required course
  Set<Course> outNeighbors;
  Course(){
    this.outNeighbors = new HaseSet<>();
  }
  
}

class MinPriorityQueue{
  public Heap q;
  public MinPriorityQueue(int size){
     q = new Heap(size);
  }
  
  public MinPriorityQueue(Process[] task){
     q = new Heap(task);
  }
  
  public void enqueue(Process p){
     q.insert(p);
  }
  
  public Process dequeue(){
     return q.removeMin();
  }
  
  public int getSize(){
    return q.size();
  }
  
  public boolean isEmpty(){
    return q..getSize() == 0;
  }
  


}

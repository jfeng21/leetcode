class Heap{
   Process[] array;
   int currentSize;
   
   public Heap(){
     this.currentSize = 0;
     this.array = new Process[10];
   }
   
   public Heap(int size){
      this.currentSize = 0;
      this.array = new Proccess[size];
   }
   
   public Heap(Process[] input){
      this.currentSize = input.length;
      this.array = new Process[currentSize];
      int i = 0;
      for(Process item : input){
         array[i] = item;
         i++;
      }
      buildHeap();
   }
   
   public int getSize(){
      return this.currentSize;
   }
   
   public int parentIndex(int i){
      return (int)Math.floor(i / 2);
   }
   
   public int leftIndex(int i){
      return 2*i;
   }
   
   public int rightIndex(int i){
      return (2 * i + 1)
   }
   //heapify down for a min-heap, swap with left child if children have same priority
   public void heapifyDown(int i) throws ArrayIndexOutOfBoundsException{
      int l = leftIndex(i);
      int r = rightIndex(i);
      int smallest;
      
      //find index of smallest key in the children
      if(l <= getSize() - 1 && array[l].getPriority() <= array[i].getPriority){
        smallest = i;
      }else{
         smallest = i;
      }
      if(r <= getSize() - 1 && array[r].getPriority() < array[smallest].getPriority()){
        smallest = r;
      }
      //swap with child with smallest key if found
      if(smallest != i){
          Process temp = array[i];
          array[i] = array[smallest];
          array[smallest] = temp;
          heapifyDown(smallest);
      }
   }
   //min heap
   public void heapifyUp(int i){
      //keep going up if key is smaller than its parent
      while(i > 0 && array[i].getPriority() < array[parentIndex(i)].getPriority()){
          Process temp = array[i];
          array[i] = array[parentIndex(i)];
          array[parentIndex(i)] = temp;
          i = parentIndex(i);
      }
   }
   
   //build a min-heap
   public void buildHeap(){
     for(int i = this.currentSize / 2; i >= 0; i--){
        heapifyDown(i);
     }
   }
   
   //remove process with smallest key: swap with last element, then heapify ---O(n)
   public Process removeMin(){
     if(getSize() < 1)  return null;
     Process p = array[0];
     array[0] = array[getSize() - 1];
     this.currentSize--;
     heapifyDown(0);
     return p;
   }
   
   //decrease the key value of a given process with index i to a new value
   public void decreasePriority(int i, int newKey){
      if(newKey > array[i].getPriority())
        return;
      else{
         array[i].setPriority(newKey);
         heapifyUp(i);
      }
      
   }
   
   //insert a new process into the heap
   public void insert(Process p) throws NullPointerException{
     //if heap is not large enough, enlarge it
     if(this.currentSize == this.array.length - 1){
        enlargeHeap(currentSize);
     }
     this.currentSize++;
     
     //choose a big number as a tempory key value
     int inf = 100000000;
     int target = p.getPriority();
     array[getSize() - 1] = p;
     array[getSize() - 1].setPriority(inf);
     int i = getSize() - 1;
     decreasePriority(i, target);
   }
   
   //enlarge by doubling size
   public void enlargeHeap(int size){
      Process[] oddArray = this.array;
      this.array = new Process[2 * size];
      int i = 0;
      //store old precess into new heap
      for(Process p : oddArray){
         this.array[i] = p;
         i++;
      }
   }
   
   

}

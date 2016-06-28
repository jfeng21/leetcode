class ImplementQueueUsingStacks_232{
  Stack<Integer> stack = new Stack<>();
  //push element x to queue
  public void push(int x){
   stack.push(x);
  }
  
  public void pop(){
   Stack<Integer> temp = new Stack<>();
   while(!stack.isEmpty()){
     temp.add(stack.pop());
   }
   temp.pop();  
   while(!temp.isEmpty()){
     stack.add(temp.pop());
   }
  }
  
  public int peek(){
    Stack<Integer> temp = new Stack<>();
    while(!stack.isEmpty()){
      temp.add(stack.pop());
    }
    int p = temp.peek();
    while(!temp.isEmpty()){
      stack.add(temp.pop());
    }
    return p;
  }
  
  public boolean empty(){
    return stack.isEmpty();
  }

}

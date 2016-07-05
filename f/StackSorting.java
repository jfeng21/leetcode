class StackSorting{
  public void stackSorting(Stack<Integer> stack){
     Stack<Integer> temp = new Stack<>();
     while(!stack.isEmpty()){
        int cur = stack.pop();
        while(!temp.isEmpty() && cur > temp.peek()){
          int t = temp.pop();
          stack.push(t);
        }
        temp.push(cur);
     }
     while(!temp.isEmpty()){
       stack.push(temp.pop());
     }
     
  }

}

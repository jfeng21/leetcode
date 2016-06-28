class SimplifyPath_71{
  //using linkedlist: push and pop are from the head of list, remove last from the tail
  public String simplifyPath(String path){
    LinkedList<String> stack = new LinkedList<>();
    Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
    for(String s : path.split("/")){
       if(s.equals("..") && !stack.isEmpty())
          stack.pop();
       else if(!skip.contains(s))
          stack.push(s);
    }
    String res = "";
    for(String s : stack)
       res = "/" + s + res;
    return res.isEmpty()? "/" : res;
  
  }

}

class ZigzagIterator_281{

    List<Iterator<Integer>> itlist = new ArrayList<Iterator<Integer>>();
    int turn = 0;
  
  public ZigzagIterator(List<Integer> l1, List<Integer> l2){
     if(!l1.isEmpty())  itlist.add(l1.iterator());
     if(!l2.isEmpty())  itlist.add(l2.iterator());
  }
  
  public int next(){
    int x = itlist.get(turn).next();
    //check if no next in one of the list, remove it
    if(!itlist.get(turn).hasNext())
        itlist.remove(turn);
     
    else turn++;
    
    //updating turn so that it move between one and another list
      if(itlist.size() != 0)
        turn %= itlist.size();
      return x;
  }
  
  public boolean hasNext(){
    return itlist.size() > 0;
  }

}

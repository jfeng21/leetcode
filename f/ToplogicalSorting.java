class ToplogicalSorting{
public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph){
  ArrayList<DirectedGraphNode> res = new ArrayList<>();
  Map<DirectedGraphNode, Integer> map = new HashMap<>();
  if(graph == null)   return res;
  
  //cal indegree
  for(DirectedGraphNode node : graph ){
    for(DirectedGraphNode neighbor : node.neighbors){
    if(map.containsKey(neighbor)){
       map.put(neighbor, map.get(neighbor) + 1);
    }else{
       map.put(neighbor, 1);
    }
    }
  }
  Queue<DirectedGraphNode> queue = new LinkedList<>();
  for(DirectedGraphNode node : graph){
     if(!map.containsKey(node)){   //check if duplicate
       queue.offer(node);
       res.add(node);
     }
  }
  while(!queue.isEmpty()){
  DirectedGraphNode node = queue.poll();
   //check nodes' neighbors
    for(DirectedGraphNode neighbor : node.neighbors){
          map.put(neighbor, map.get(node) - 1);  //if visited, indegree--
          if(map.get(neighbor) == 0){    //if indegree == 0, add it to res and offer to queue for future traverse
          res.add(neighbor);
          queue.offer(neighbor);   
          }
        }
   }
   return res;
  }

}
   


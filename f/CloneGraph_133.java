class CloneGraph_133{
//DFS
public UndirectedGraphNode cloneGraph(UndirectedGraphNode graph){
   if(graph == null) return null;
   Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
   return dfs(graph, map);
}
private UndirectedGraphNode dfs(UndirectedGraphNode graph, Map<UndirectedGraphNode, UndirectedGraphNode> map){
   if(graph == null) return null;
    if(map.containsKey(graph)) //if the node is already exists in map, just get its neighbors
       return map.get(graph);
    
    //copy nodes
    UndirectedGraphNode copy = new UndirectedGraphNode(graph.label);
    map.put(graph, copy);
   
    //copy neighbors
    for(UndirectedGraphNode node : graph.neighbors){
      copy.neighbors.add(dfs(node, map));
    }
    return copy;
}

//BFS--prefered
public UndirectedGraphNode cloneGraph(UndirectedGraphNode graph){
  if(graph == null)  return null;
  
  Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
  Queue<UndirectedGraphNode> q = new LinkedList();
  q.add(graph);  //offer the head node to queue
  UndirectedGraphNode copy = new UndirectedGraphNode(graph.label);
  map.put(graph, copy);   //mapping the graph node and its copy
  
  while(!q.isEmpty()){
    UndirectedGraphNode node = q.poll();
    //copy and connect neighbors
    for(UndirectedGraphNode neighbor : node.neighbors){
       if(map.containsKey(neighbor)){    //if the node is already in the map, just adds its neighbors
         map.get(node).neighbors.add(map.get(neighbor));    //copy.neighbors.add(copied neighbor)
       }else{   //if the node is not in the map, create new copy
        UndirectedGraphNode neighborCopy = new UndirectedGraphNode(neighbor.label);
        //add neighbor copy and then mapping it 
        map.get(node).neighbors.add(neighborCopy);
        map.put(neighbor, neighborCopy);
         //add neighbor to queue for future traverse
        q.add(neighbor);
       }
    }
  
  }
  
return copy;
}


}

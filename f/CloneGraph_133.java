class CloneGraph_133{
//DFS
public UndirectedGraphNode cloneGraph(UndirectedGraphNode graph){
   if(graph == null) return null;
   Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
   return dfs(graph, map);
}
private UndirectedGraphNode dfs(UndirectedGraphNode graph, Map<UndirectedGraphNode, UndirectedGraphNode> map){
   if(graph == null) return null;
    if(map.containsKey(graph))  return map.get(graph);
    
    //copy nodes
    UndirectedGraphNode copy = new UndirectedGraphNode(graph.label);
    map.put(graph, copy);
   
    //copy neighbors
    for(UndirectedGraphNode node : graph.neighbors){
      copy.neighbors.add(dfs(node, map));
    }
    return copy;
}

//BFS
public UndirectedGraphNode cloneGraph(UndirectedGraphNode graph){
  if(graph == null)  return null;
  Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
  Queue<UndirectedGraphNode> q = new LinkedList();
  q.add(graph);
  UndirectedGraphNode copy = new UndirectedGraphNode(graph.label);
  map.put(graph, copy);
  
  while(!q.isEmpty()){
    UndirectedGraphNode node = q.poll();
    //copy and connect neighbors
    for(UndirectedGraphNode neighbor : node.neighbors){
       if(map.containsKey(neighbor)){
         map.get(node).neighbors.add(map.get(neighbor));
       }else{
        UndirectedGraphNode neighborCopy = new UndirectedGraphNode(neighbor.label);
        map.get(node).neighbors.add(neighborCopy);
        map.put(neighbor, neighborCopy);
      //add neighbor to queue
        q.add(neighbor);
       }
    }
  
  }
  
return copy;
}


}

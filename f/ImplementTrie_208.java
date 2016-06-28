class ImplementTrie_208{
  
  private TrieNode root;
  public Trie(){
    root = new TrieNode();
  }
  //insert a word
  public void insert(String word){
   TrieNode node = root;
    for(char c : word.toCharArray()){
       if(!node.containsKey(c)){
          node.put(c, new TrieNode());
       }
        node = node.get(c);
    }
    node.setEnd();
  }
  
  private TrieNode searchPrefix(String word){
    TrieNode node = root;
    for(char c : word.toCharArray()){
      if(!node.containsKey(c))
        return null;
      else
       node = node.get(c);
    }
    return node;
  }
  
  public boolean search(String word){
    TrieNode node = searchPrefix(word);
    return node != null && node.isEnd();
  }
  
  public boolean startsWith(String prefix){
    TrieNode node = searchPrefix(prefix);
    return node != null;
  }

}

class TrieNode(){
  private TrieNode[] links;
  private final int R = 26;
  private boolean isEnd;
  public TrieNode(){
    links = new TrieNode[R];
    }
  public boolean containsKey(char c){
     return links[c - 'a'] != null;
  }
  public TrieNode get(char c){
     return links[c - 'a'];
  }
  public void put(char c, TrieNode node){
    links[c - 'a'] = node;
  }
  public boolean isEnd(){
    return isEnd;
  }
  
  public void setEnd(){
    isEnd = true;
  }
}

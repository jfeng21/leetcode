class WordSearchII_212{
  public List<String> findWords(char[][] board, String[] words){
   List<String> res = new ArrayList<String>();
    if(board == null || board.length == 0 || board[0].length == 0)
      return res;
    //build Trie Tree
    TrieNode root = buildTrie(words);
    //check the words using dfs
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        dfs(board, i, j, root, res);
      }
    }
    return res;
  }
  
  private void dfs(char[][] board, int i, int j, TrieNode p, List<String> res){
    char c = board[i][j];
    if(c == '#' || p.next[c - 'a'] == null)
      return;
    p = p.next[c - 'a'];
    if(p.word != null){    //found one word
      res.add(p.word);
      p.word = null;
    }
    board[i][j] = '#';  //mark visited
    if(i > 0) dfs(board, i - 1, j, p, res);
    if(j > 0) dfs(board, i, j - 1, p, res);
    if(i < board.length - 1) dfs(board, i + 1, j, p, res);
    if(j < board[0].length - 1) dfs(board, i, j + 1, p, res);
    board[i][j] = c;
  }
  
  public TrieNode buildTrie(String[] words){
    TrieNode root = new TrieNode();
    for(String s : words){
      TrieNode p = root;
       for(char c : s.toCharArray()){
         int i = c - 'a';
         if(p.next[i] == null) p.next[i] = new TrieNode();
         p = p.next[i];
       }
      p.word = s;
    }
  return root;
  }
  }
  
  class TrieNode{
   TrieNode[] next = new TrieNode[26];
   String word;
  }
  

}

class WordBreak_139{
//dp:  pos[i] == pos[j] && s.substring(j, i) in dict
//O(n) time, O(n) space
  public boolean wordBreak(String s, Set<String> dict){
    if(s == null || s.length() == 0)  return true;
    
    //initial boolean array
    boolean[] pos = new boolean[s.length() + 1];
    pos[0] = true;
    
    //dp
    for(int i = 1; i < pos.length; i++){
       for(int j = 0; j < i; j++){
          if(pos[j] && dict.contains(s.substring(j, i))){
            pos[i] = true;
            break;
          }
       }
    }
    return pos[pos.length - 1];
  }

}

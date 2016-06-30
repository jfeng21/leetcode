class RemoveExtraSpaces{
  public String removeSpace(String s){
    s.trim();
    String res = "";
    for(char c : s.toCharArray()){
      if(c != ' '){
        res += (c + "");
        flag = false;
      }else{
        if(flag == false){
        res += (c + "");
        flag = true;
        }
      }
    }
    return res;
  }

}

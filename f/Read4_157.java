class Read4_157 extends Reader4{
public int read(char[] buf, int n){
  boolean end = false;
  int total = 0;
  char[] tmp = new char[4];
  
  while(!end && total < n){
      int count = read4(tmp);
      if(count < 4)
        end = true;
      count = Math.min(n - total, count);   //check the last
      //copy from temp buffer to buff
      for(int i = 0; i < count; i++){
      buf[total++] = tmp[i];
      }
  }
  return total;
}

}

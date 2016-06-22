class ReadNCharII_`158 extends Reader4{
private int buff_ptr = 0;
private int buff_cnt = 0;
private char[] buff = new char[4];

public int read(char[] buf, int n){
  int ptr = 0;
  while(ptr < n){
    if(buff_ptr == 0)
       buff_cnt = read4(buff);
    if(buff_cnt == 0)
      break;
      
    while(ptr < n && buff_ptr < buff_cnt){
       buf[ptr++] = buff[buff_ptr++];
    }
    if(buff_ptr >= buff_cnt)
      buff_ptr = 0;
  
  }
return ptr;
}


}

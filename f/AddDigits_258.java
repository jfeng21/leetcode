class AddDigits_258{
  public int addDigits(int num){
  //recursive
     return num == 0 ? (num % 9 == 0 ? 9 : (num % 9));
  }

}

class ClimbingStairs_70{
  int p = 1, q = 1;
  
  for(int i = 2; i <= n; i++){
    int temp = p;
    q += p;
    p = temp;
  }
  return q;
}

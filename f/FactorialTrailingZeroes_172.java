class FactorialTrailingZeroes_172{
   public int trailingZeroes(int n){
      return n == 0 ? n : n / 5 + traiingZeros(n / 5);
   }

}

class ExcelSheetColumnTitle_168{
  public String convertToTitle(int n){
    return n == 0 ? "":converToTitle(--n / 26) + (char)('A' + (n % 26));
  }

}
